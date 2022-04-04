package com.example.springbestpractice.repository;

import com.example.springbestpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Nazim Uddin Asif
 * @version: 1.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
