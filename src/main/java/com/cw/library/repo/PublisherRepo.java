package com.cw.library.repo;

import com.cw.library.entity.Author;
import com.cw.library.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher,Integer> {
}
