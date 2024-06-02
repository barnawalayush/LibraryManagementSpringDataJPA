package com.barnawal.librarymanagementjpa.repository;

import com.barnawal.librarymanagementjpa.entity.Complaint;
import com.barnawal.librarymanagementjpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ComplaintRepo extends JpaRepository<Complaint, Long> {

    @Query("Select c from Complaint c where c.user.id=:userId")
    List<Complaint> findAllByUser(@Param("userId") Long userId);
}
