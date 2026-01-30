package com.var.service;

import com.var.dto.request.UpdatePasswordRequest;
import com.var.dto.request.UserLoginRequest;
import com.var.dto.request.UserRegistrationRequest;
import com.var.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse registerUser(UserRegistrationRequest request);
    UserResponse loginUser(UserLoginRequest request);
    boolean updatePassword(UpdatePasswordRequest request);
    UserResponse getUserById(int userId);
    List<UserResponse> getAllUsers();
    boolean updateUserRole(int userId, String role);
}
