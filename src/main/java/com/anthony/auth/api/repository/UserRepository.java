package com.anthony.auth.api.repository;

import com.anthony.auth.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
