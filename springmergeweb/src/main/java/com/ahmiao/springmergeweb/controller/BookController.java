package com.ahmiao.springmergeweb.controller;


import com.ahmiao.springmergeweb.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
public class BookController {
    @GetMapping("/book")
    @ResponseBody
    public Book book() {
        Book book = new Book();
        book.setName("ahmiao");
        book.setPrice(12.5f);
        book.setPublicationDate(new Date());
        return book;
    }
}
