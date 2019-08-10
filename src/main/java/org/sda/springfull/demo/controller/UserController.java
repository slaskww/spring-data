package org.sda.springfull.demo.controller;

import org.sda.springfull.demo.dto.UserDto;
import org.sda.springfull.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.sda.springfull.demo.mapper.UserMapper.toDto;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.GET)
    public String addUserView(Model model){
        model.addAttribute("userDto", new UserDto());
        return "add_user";
    }

    @PostMapping(value = "/user")
    public String createUser(@Valid @ModelAttribute("userDto") UserDto userDto, Model model){

        if(userDto.getId() == null) {
            this.userService.createUser(userDto);
        } else {
            this.userService.updateUser(userDto);
        }

        model.addAttribute("users", this.userService.findAll());
        return "users";
    }

    @PostMapping(value = "/deleteUser")
    public String deleteUser(@RequestParam(required = true) Long id, Model model){
        this.userService.deleteUserById(id);
        model.addAttribute("users", this.userService.findAll());

        return "users";
    }

    @PostMapping(value = "/editUser")
    public String editUser(@RequestParam(required = true) Long id, Model model){
        model.addAttribute("userDto", toDto(this.userService.getById(id)));

        return "add_user";
    }
}
