package com.barnawal.librarymanagementjpa.Controller;

import com.barnawal.librarymanagementjpa.Services.servicesImplementation.LibrarianServicesImpl;
import com.barnawal.librarymanagementjpa.entity.Book;
import com.barnawal.librarymanagementjpa.entity.Complaint;
import com.barnawal.librarymanagementjpa.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.sql.Connection;
import java.util.List;


@Controller
public class LibrarianController {

    @Autowired
    LibrarianServicesImpl librarianServices;

    public List<Book> displayBooks(){
        return librarianServices.displayBook();
    }

    public List<Users> displayAllUsers(){
        return librarianServices.displayAllUsers();
    }

    public void addBook(Book book){
        librarianServices.addBook(book);
    }

    public void addUser(Users user){librarianServices.addUser(user);}

    public void updateBook(Book oldBook, Book newBook){
        librarianServices.updateBook(oldBook, newBook);
    }

    public void getAllFeedback(){
        librarianServices.getAllFeedback();
    }

    public List<Complaint> getALlComplaintByUserId(Users user) {
        return librarianServices.getALlComplaintByUserId(user);
    }

    public void removeUser(Long userId){
        librarianServices.removeUser(userId);
    }

    public void displayAllComplaint(){
        librarianServices.displayAllComplaint();
    }

    public void deleteBookById(Long bookId){
        librarianServices.deleteBookById(bookId);
    }

    public void getAllFeedbacksByBookId(Long bookId){
        librarianServices.getAllFeedbacksByBookName(bookId);
    }

    public List<Users> getUsersByName(String name){
        return librarianServices.getUsersByName(name);
    }

}
