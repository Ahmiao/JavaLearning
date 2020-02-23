package com.ahmiao.springmergeview.controller;

import com.ahmiao.springmergeview.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @GetMapping("/books")
    public ModelAndView books(){
        List<Book> books=new ArrayList<>();
        Book b1=new Book();
        b1.setId(1);
        b1.setName("ahmiao");
        b1.setAuthor("ah");
        books.add(b1);
        ModelAndView mv=new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("books");
        return mv;
    }
}
