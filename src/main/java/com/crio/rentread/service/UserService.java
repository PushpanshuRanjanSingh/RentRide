package com.crio.rentread.service;

import com.crio.rentread.entity.User;

import java.util.List;

public interface UserService {
    User register(User user);
    User login(String email, String password);
    User update(Long id, User user);
    List<User> getUsers();
    User getUserById(Long id);
    boolean delete(Long id);
}
