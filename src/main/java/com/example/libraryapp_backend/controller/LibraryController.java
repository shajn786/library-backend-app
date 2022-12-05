package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {


    @PostMapping("/")
    public String AdminLogin()
            {
                return "admin login page";
            }

    @PostMapping("/userlogin")
    public String UserLogin()
    {
        return "user login";
    }

    @PostMapping("/registration")
    public String UserRegistration()
    {
        return "user registration";
    }

    @PostMapping("/bookenrty")
    public String BookEntry()
    {
        return "book entry" ;
    }

    @PostMapping("/booksearch")
    public String BookSearch()
    {
        return "book search" ;
    }

    @PostMapping("/bookedit")
    public String BookEdit()
    {
        return "book edit";
    }

    @PostMapping("/bookissue")
    public String BookIssue()
    {
        return "book issue";
    }
}
