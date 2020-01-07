package com.github.zharovvv.springwebapp.system.controller;

import com.github.zharovvv.springwebapp.system.model.User;
import com.github.zharovvv.springwebapp.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView validateUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("users_check_page");
        return modelAndView;
    }

    @PostMapping(value = "/check")
    public @ResponseBody
    String checkUser(@ModelAttribute("userFromServer") User user) {
        if ("admin".equals(user.getName()) && "admin".equals(user.getPassword())) {
            return "valid";
        }
        return "invalid";
    }
}
