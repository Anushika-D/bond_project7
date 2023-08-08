package com.example.bond.service;

import java.util.ArrayList;
import java.util.List;

import com.example.bond.entities.Book;
import com.example.bond.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(book -> books.add(book));
        return books;
    }
    public Book getBookById(int id)
    {
        return bookRepository.findById(id).get();
    }
    public void saveOrUpdate(Book book)
    {
        bookRepository.save(book);
    }
    //deleting a specific record
    public void delete(int id)
    {
        bookRepository.deleteById(id);
    }

    public List<Book> getBookByUserName(String username) {
        return bookRepository.getBookByUsers_Name(username);
    }
}