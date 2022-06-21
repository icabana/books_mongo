package com.example.books_mongo.repository;

import com.example.books_mongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface IBookRepository extends MongoRepository<Book, String> {



}
