package com.demojpa.controller;

import com.demojpa.entity.Book;
import com.demojpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api")
public class BookController {

    @Autowired
    private BookService bookService;

    // Save operation
    @PostMapping("/books")
    public Book saveBook(
            @Valid @RequestBody Book book)
    {
        return bookService.saveBook(book);
    }

    // Read operation
    @GetMapping("/books")
    public List<Book> fetchDepartmentList()
    {
        return bookService.fetchBookList();
    }

    // Update operation
    @PutMapping("/books/{id}")
    public Book
    updateDepartment(@RequestBody Book book,
                     @PathVariable("id") Long departmentId)
    {
        return bookService.updateBook(
                book, departmentId);
    }

    // Delete operation
    @DeleteMapping("/books/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                               Long bookId)
    {
        bookService.deleteBookById(
                bookId);

        return "Deleted Successfully";
    }
}
