package com.barnawal.librarymanagementjpa.Services.servicesImplementation;

import com.barnawal.librarymanagementjpa.Services.LibrarianServices;
import com.barnawal.librarymanagementjpa.entity.Book;
import com.barnawal.librarymanagementjpa.entity.Complaint;
import com.barnawal.librarymanagementjpa.entity.Feedback;
import com.barnawal.librarymanagementjpa.entity.Users;
import com.barnawal.librarymanagementjpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.List;

@Service
public class LibrarianServicesImpl implements LibrarianServices {

    @Autowired
    private LibrarianRepo librarianRepo;

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private FeedbackRepo feedbackRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ComplaintRepo complaintRepo;

    @Override
    public void addBook(Book book) {
        bookRepo.save(book);
    }

    @Override
    public void addUser(Users user) {
        userRepo.save(user);
    }

    @Override
    public void updateBook(Book oldBook, Book newBook) {

    }

    @Override
    public void deleteBookById(Long bookId) {
        bookRepo.deleteById(bookId);
    }

    @Override
    public List<Book> displayBook() {
        return bookRepo.findAll();
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackRepo.findAll();
    }

    @Override
    public List<Complaint> getALlComplaintByUserId(Users user) {
        return complaintRepo.findAllByUser(user.getId());
    }

    @Override
    public void removeUser(Long userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public List<Users> displayAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public List<Complaint> displayAllComplaint() {
        return complaintRepo.findAll();
    }

    @Override
    public void getAllFeedbacksByBookName(Long bookId) {
        feedbackRepo.findAllByBookName(bookId);
    }

    @Override
    public List<Users> getUsersByName(String name) {
        return userRepo.findUsersByName(name);
    }
}
