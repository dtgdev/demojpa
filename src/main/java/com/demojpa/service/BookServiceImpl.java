package com.demojpa.service;

import com.demojpa.entity.Book;
import com.demojpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    // Save operation
    @Override
    public Book saveBook(Book book)
    {
        return bookRepository.save(book);
    }

    // Read operation
    @Override public List<Book> fetchBookList()
    {
        return (List<Book>)
                bookRepository.findAll();
    }

    // Update operation
    @Override
    public Book
    updateBook(Book book,
                     Long bookId)
    {
        Book bookDB
                = bookRepository.findById(bookId)
                .get();

        if (Objects.nonNull(book.getName())
                && !"".equalsIgnoreCase(
                book.getName())) {
            bookDB.setName(
                    book.getName());
        }


        return bookRepository.save(bookDB);
    }

    // Delete operation
    @Override
    public void deleteBookById(Long bookId)
    {
        bookRepository.deleteById(bookId);
    }
}
