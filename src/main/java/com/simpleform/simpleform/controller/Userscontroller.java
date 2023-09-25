package com.simpleform.simpleform.controller;
import org.springframework. stereotype.Controller;
import org.spring framework.web.bind.annotation.GetMapping
@Controller
public class UsersController {
    @GetMapping ("/register")
    public String getRegister Page () {
        return "register_page";
    }