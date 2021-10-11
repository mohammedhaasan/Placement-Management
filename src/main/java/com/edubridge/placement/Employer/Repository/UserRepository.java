package com.edubridge.placement.Employer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.edubridge.placement.Employer.Model.User;


public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);



}

