package com.barnawal.librarymanagementjpa.repository;

import com.barnawal.librarymanagementjpa.entity.ReservedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReservedBookRepo extends JpaRepository<ReservedBook, Long> {

    @Query("Select b from ReservedBook b where b.user.id = :userId and b.deadline = :deadline")
    List<ReservedBook> findAllByUserIdCrossedDeadline(@Param("userId") Long userId, @Param("deadline") String deadline);
}
