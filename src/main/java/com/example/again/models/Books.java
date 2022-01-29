package com.example.again.models;

import javax.persistence.*;

@Entity // to jest model odpowiadająca za tablicę w bazie danych
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //incrementacja KLUCZA dla nowych książek
    private Long id;


    private String title, decrition, author;
    private int quantity;

    public Long getId() {
        return id;
    }

    // otrzymanie i ustawienie wartości KLUCZA oraz bazowych danych informacji o książkach
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecrition() {
        return decrition;
    }

    public void setDecrition(String decrition) {
        this.decrition = decrition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
