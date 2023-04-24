package com.guille.porti.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guille.porti.models.User;



public interface  UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);

    User save(User user);
    
}
