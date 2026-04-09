package com.anthony.auth.api.service;
import com.anthony.auth.api.model.User;
import com.anthony.auth.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public User userRegister(User user) {
        return userRepository.save(user);
    }

}