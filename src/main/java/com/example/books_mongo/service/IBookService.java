package com.example.books_mongo.service;

import com.example.books_mongo.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    List<Book> findAllBook();

    Book createBook(Book book);

    Optional<Book> findByIdBook(String id);

    void deleteBook(String id);

    Book updateBook(Book book);

}
