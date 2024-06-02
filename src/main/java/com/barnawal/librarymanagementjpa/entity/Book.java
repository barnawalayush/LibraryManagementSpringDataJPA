package com.barnawal.librarymanagementjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bookName;

    private String author;
    private String publication;
    private Boolean availability;
    private String category;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

}
