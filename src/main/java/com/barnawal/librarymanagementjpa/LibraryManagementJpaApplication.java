package com.barnawal.librarymanagementjpa;

import com.barnawal.librarymanagementjpa.Controller.LibrarianController;
import com.barnawal.librarymanagementjpa.Controller.UserController;
import com.barnawal.librarymanagementjpa.entity.Book;
import com.barnawal.librarymanagementjpa.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryManagementJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LibraryManagementJpaApplication.class, args);


        LibrarianController controller = context.getBean(LibrarianController.class);
        UserController userController = context.getBean(UserController.class);

        Users user1 = new Users();
        user1.setName("John Doe");
        user1.setPassword("password123");

        Users user2 = new Users();
        user2.setName("Jane Doe");
        user2.setPassword("password456");

        Book book1 = new Book();
        book1.setBookName("Book 1");
        book1.setAuthor("Author 1");
        book1.setPublication("Publication 1");
        book1.setAvailability(true);
        book1.setCategory("Category 1");

        Book book2 = new Book();
        book2.setBookName("Book 2");
        book2.setAuthor("Author 2");
        book2.setPublication("Publication 2");
        book2.setAvailability(true);
        book2.setCategory("Category 2");

        Book book3 = new Book();
        book3.setBookName("Book 3");
        book3.setAuthor("Author 3");
        book3.setPublication("Publication 3");
        book3.setAvailability(true);
        book3.setCategory("Category 3");

        Book book4 = new Book();
        book4.setBookName("Book 4");
        book4.setAuthor("Author 4");
        book4.setPublication("Publication 4");
        book4.setAvailability(true);
        book4.setCategory("Category 4");

        Book book5 = new Book();
        book5.setBookName("Book 5");
        book5.setAuthor("Author 5");
        book5.setPublication("Publication 5");
        book5.setAvailability(true);
        book5.setCategory("Category 5");

        controller.addBook(book1);
        controller.addBook(book2);
        controller.addBook(book3);
        controller.addBook(book4);
        controller.addBook(book5);

        controller.addUser(user1);
        controller.addUser(user2);

        System.out.println("Displayed Books: " + controller.displayBooks());

        System.out.println("Users total: " + controller.displayAllUsers());

        System.out.println("User by Name: " + controller.getUsersByName("John Doe"));

        userController.borrowBook(1L, 2L);

    }

}