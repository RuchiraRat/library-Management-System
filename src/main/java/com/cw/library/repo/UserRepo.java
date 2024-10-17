package com.cw.library.repo;

import com.cw.library.entity.Publisher;
import com.cw.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
