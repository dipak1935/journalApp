package com.engineeringDigest.journalApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalEntryController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome";
    }
}
