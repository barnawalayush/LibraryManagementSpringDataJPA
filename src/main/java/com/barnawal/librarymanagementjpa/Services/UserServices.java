package com.barnawal.librarymanagementjpa.Services;


import com.barnawal.librarymanagementjpa.entity.*;

import java.sql.Connection;
import java.util.List;

public interface UserServices {

    List<Book> displayBooks();

    List<ReservedBook> displayBorrowedBooks(String userId);

    List<ReservedBook> displayDeadlineCrossedBook(Long userId);

    void BorrowBook(Long userId, Long bookId);

    void RenewBook(Users user, ReservedBook book);

    void returnBook(Users user, ReservedBook book);

    void submitFeedback(Feedback feedback);

    void fileComplaint(Complaint complaint);
    List<Book> searchBookByPublications(String publication);
    List<Complaint> seeAllComplaint(Users user);

}
