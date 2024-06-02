package com.barnawal.librarymanagementjpa.repository;

import com.barnawal.librarymanagementjpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<Users, Long> {


    @Query("Select u from Users u where u.name = :name")
    List<Users> findUsersByName(@Param("name") String name);
}
