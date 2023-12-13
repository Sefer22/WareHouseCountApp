package com.example.warehousecount.Service;

import com.example.warehousecount.Dto.UserDto;

public interface UserService {
    void registerUser(UserDto userDto);
    String loginUser(UserDto userDto);
}
