package com.demojpa.service;

import com.demojpa.entity.Book;

import java.util.List;

public interface BookService {

    // Save operation
    Book saveBook(Book book);

    // Read operation
    List<Book> fetchBookList();

    // Update operation
    Book updateBook(Book department,
                                Long departmentId);

    // Delete operation
    void deleteBookById(Long bookId);
}
