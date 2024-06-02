package com.barnawal.librarymanagementjpa.Controller;

import com.barnawal.librarymanagementjpa.Services.servicesImplementation.UserServicesImp;
import com.barnawal.librarymanagementjpa.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.Connection;
import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserServicesImp userServicesImp;


    public void displayBook(Connection connection){
        userServicesImp.displayBooks();
    }

    public void displayBorrowedBook(String userId, Connection connection){
        userServicesImp.displayBorrowedBooks(userId);
    }

    public List<ReservedBook> displayDeadlineCrossedBook(Long userId){
        return userServicesImp.displayDeadlineCrossedBook(userId);
    }

    public void borrowBook(Long userId, Long bookId){
        userServicesImp.BorrowBook(userId, bookId);
    }

    public void RenewBook(Users user, ReservedBook book){
        userServicesImp.RenewBook(user, book);
    }

    public void returnBook(Users user, ReservedBook book) {
        userServicesImp.returnBook(user, book);
    }

    public void submitFeedback(Feedback feedback, Connection connection) {
        userServicesImp.submitFeedback(feedback);
    }

    public void fileComplaint(Complaint complaint, Connection connection) {
        userServicesImp.fileComplaint(complaint);
    }

    public List<Book> searchBookByPublications(String publication, Connection connection){
        return userServicesImp.searchBookByPublications(publication);
    }

    public void seeAllComplaint(Users user, Connection connection){
        userServicesImp.seeAllComplaint(user);
    }
}
