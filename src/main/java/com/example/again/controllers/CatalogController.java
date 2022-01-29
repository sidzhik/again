package com.example.again.controllers;

import com.example.again.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repository.BooksRepository;

import java.util.Iterator;

@Controller
public class CatalogController {

    // adnotacja, jaka daje możliwość przenieść wszystkie dane o książkach do szablonu
    @Autowired
    private BooksRepository booksRepository;

    @GetMapping ("/catalog")
    public String catalog (Model model){
        Iterable<Books> books = booksRepository.findAll(); // upload all data from spring_web_books
        model.addAttribute("books", books);

       return "catalog";
    }
}
