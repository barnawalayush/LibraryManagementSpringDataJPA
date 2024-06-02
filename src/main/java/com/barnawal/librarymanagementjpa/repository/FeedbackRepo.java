package com.barnawal.librarymanagementjpa.repository;

import com.barnawal.librarymanagementjpa.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Parameter;


@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Long> {

    @Query("Select f from Feedback f where f.bookId = :bookId")
    void findAllByBookName(@Param("bookId")Long bookId);
}
