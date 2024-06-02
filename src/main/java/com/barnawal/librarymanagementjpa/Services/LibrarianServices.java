package com.barnawal.librarymanagementjpa.Services;

import com.barnawal.librarymanagementjpa.entity.Book;
import com.barnawal.librarymanagementjpa.entity.Complaint;
import com.barnawal.librarymanagementjpa.entity.Feedback;
import com.barnawal.librarymanagementjpa.entity.Users;

import java.sql.Connection;
import java.util.List;

public interface LibrarianServices {

    void addBook(Book book);
    void addUser(Users user);
    void updateBook(Book oldBook, Book newBook);
    void deleteBookById(Long bookId);
    List<Book> displayBook();
    List<Feedback> getAllFeedback();
    List<Complaint> getALlComplaintByUserId(Users user);
    void removeUser(Long userId);
    List<Users> displayAllUsers();
    List<Complaint> displayAllComplaint();
    void getAllFeedbacksByBookName(Long bookId);

    List<Users> getUsersByName(String name);

}
