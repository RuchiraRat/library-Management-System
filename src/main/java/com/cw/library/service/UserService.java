package com.cw.library.service;

import com.cw.library.dto.UserDTO;
import com.cw.library.dto.UserSaveDTO;
import com.cw.library.dto.UserUpdateDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();

    String updateUSer(UserUpdateDTO userUpdateDTO);

    String deleteUser(int id);
}
