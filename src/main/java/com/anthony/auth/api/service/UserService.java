package com.anthony.auth.api.service;
import com.anthony.auth.api.model.User;
import com.anthony.auth.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

}
