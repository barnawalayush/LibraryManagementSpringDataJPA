package com.barnawal.librarymanagementjpa.repository;

import com.barnawal.librarymanagementjpa.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibrarianRepo extends JpaRepository<Librarian, Long> {
}
