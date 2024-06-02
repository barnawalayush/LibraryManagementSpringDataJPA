package com.barnawal.librarymanagementjpa.repository;

import com.barnawal.librarymanagementjpa.entity.Book;
import org.hibernate.query.criteria.JpaSearchedCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Long> {

    @Query("Select b from Book b where b.publication= :publication")
    List<Book> findAllByPublication(@Param("publication") String publication);

    @Modifying
    @Transactional
    @Query("UPDATE Book b SET b.user.id = :userId, b.availability = false WHERE b.bookId = :bookId")
    void updateUserIdByBookId(@Param("userId") Long userId, @Param("bookId") Long bookId);

    @Modifying
    @Transactional
    @Query("update Book b Set b.user=null, b.availability=true where b.bookId = :id")
    void updateBookDetailById(@Param("id") Long id);
}
