package com.cw.library.repo;

import com.cw.library.entity.Author;
import com.cw.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
