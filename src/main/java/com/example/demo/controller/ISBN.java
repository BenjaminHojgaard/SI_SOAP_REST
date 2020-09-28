package com.example.demo.controller;


import com.example.demo.exceptions.BookNotFoundException;
import com.example.demo.exceptions.StudentNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.model.Student;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.SOAPISBNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ISBN")
public class ISBN {

    @Autowired
    BookRepository repository;

    @GetMapping("/")
    public List<Book> verifyISBN() {

        return repository.findAll();

    }

    @GetMapping("/{isbn}")
    public EntityModel<Book> verifyISBN(@PathVariable String isbn) {

        if (SOAPISBNService.isValid(isbn)){
            Optional<Book> book = repository.findById(isbn);
            if (book.isEmpty())
                throw new BookNotFoundException("Book by that ISBN not found");

            return EntityModel.of(book.get());
        }
        throw new BookNotFoundException("Invalid ISBN.");
    }

}
