package com.barnawal.librarymanagementjpa.Services.servicesImplementation;


import com.barnawal.librarymanagementjpa.Services.UserServices;
import com.barnawal.librarymanagementjpa.entity.*;
import com.barnawal.librarymanagementjpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class UserServicesImp implements UserServices {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private FeedbackRepo feedbackRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ComplaintRepo complaintRepo;

    @Autowired
    private ReservedBookRepo reservedBookRepo;

    @Override
    public List<Book> displayBooks() {
        return bookRepo.findAll();
    }

    @Override
    public List<ReservedBook> displayBorrowedBooks(String userId) {
        return reservedBookRepo.findAll();
    }

    @Override
    public List<ReservedBook> displayDeadlineCrossedBook(Long userId) {
        return reservedBookRepo.findAllByUserIdCrossedDeadline(userId, String.valueOf(LocalDate.now()));
    }

    @Override
    public void BorrowBook(Long userId, Long bookId) {
        bookRepo.updateUserIdByBookId(userId, bookId);
        ReservedBook reservedBook = new ReservedBook();
        reservedBook.setUser(userRepo.findById(userId).get());
        reservedBook.setId(bookId);
        reservedBook.setBorrowedAt(String.valueOf(LocalDate.now()));
        reservedBook.setDeadline(String.valueOf(LocalDate.now().plusDays(2)));
        reservedBookRepo.save(reservedBook);
    }

    @Override
    public void RenewBook(Users user, ReservedBook book) {

    }

    @Override
    public void returnBook(Users user, ReservedBook book) {
        reservedBookRepo.deleteById(book.getId());
        bookRepo.updateBookDetailById(book.getId());
    }

    @Override
    public void submitFeedback(Feedback feedback) {
        feedbackRepo.save(feedback);
    }

    @Override
    public void fileComplaint(Complaint complaint) {
        complaintRepo.save(complaint);
    }

    @Override
    public List<Book> searchBookByPublications(String publication) {
        return bookRepo.findAllByPublication(publication);
    }

    @Override
    public List<Complaint> seeAllComplaint(Users user) {
        return complaintRepo.findAllByUser(user.getId());
    }
}
