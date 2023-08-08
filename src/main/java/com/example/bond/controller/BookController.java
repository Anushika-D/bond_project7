package com.example.bond.controller;

import java.util.List;

import com.example.bond.service.BookService;
import com.example.bond.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/getAllBooks")
    private List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    private Book getBook(@PathVariable("id")Integer id)
    {
        return bookService.getBookById(id);
    }

    @GetMapping("/user/{username}")
    private List<Book> getBookByUserName(@PathVariable("username")String username)
    {
        return bookService.getBookByUserName(username);
    }

    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable("id")int id) {
        bookService.delete(id);
    }

    @PostMapping("/save")
    private Integer saveUser(@RequestBody Book book)
    {
        bookService.saveOrUpdate(book);
        return book.getId();
    }
}