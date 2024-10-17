package com.cw.library.controller;


import com.cw.library.dto.*;
import com.cw.library.entity.User;
import com.cw.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserSaveDTO userSaveDTO)
    {
        String username = userService.addUser(userSaveDTO);
        return "Added Successfully";
    }

    @GetMapping(path = "/getAllUser")
    public List<UserDTO> getAllAuthor()
    {
        List<UserDTO> allUsers = userService.getAllUser();
        return allUsers;
    }

    @PutMapping(path = "/update")
    public String updateUSer(@RequestBody UserUpdateDTO userUpdateDTO)
    {
        String username = userService.updateUSer(userUpdateDTO);
        return username;
    }


    @DeleteMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable(value = "id")int id)
    {
        String authorname = userService.deleteUser(id);
        return "deleteddd";
    }


}
