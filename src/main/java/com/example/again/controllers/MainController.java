package com.example.again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// Klasa odpowiadająca za wszystkie działania na stronie internetowej
@Controller
public class MainController {

    @GetMapping("/") // home page processing
    public String home(Model model) // niezbędny parameter model
    {
        model.addAttribute("title", "Bookshop");
        return "home";  // szablon url/home
    }

    @GetMapping("/about") // about page processing
    public String about(Model model) // niezbędny parameter model
    {
        model.addAttribute("title", "O nas");
        return "about"; // szablon url/about
    }

}
