package com.example.books_mongo.service;

import com.example.books_mongo.model.Book;
import com.example.books_mongo.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpBookService implements IBookService{

    private final IBookRepository iBookRepository;

    public ImpBookService(IBookRepository iBookRepository) {
        this.iBookRepository = iBookRepository;
    }

    @Override
    public List<Book> findAllBook() {
        return iBookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return iBookRepository.save(book);
    }

    @Override
    public Optional<Book> findByIdBook(String id) {
        return iBookRepository.findById(id);
    }

    @Override
    public void deleteBook(String id) {
        iBookRepository.deleteById(id);
    }

    @Override
    public Book updateBook(Book book) {
        return iBookRepository.save(book);
    }
}
