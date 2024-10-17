package com.cw.library.repo;

import com.cw.library.entity.Borrow;
import com.cw.library.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepo extends JpaRepository<Borrow,Integer> {
}
