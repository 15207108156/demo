package com.example.service;

import com.example.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User regUser(String uerId);
}
