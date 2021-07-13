package com.z.controller;

import com.z.pojo.Books;
import com.z.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookService")
    private BookService bookService;
    @RequestMapping("/allBooks")
    public String allBook(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("books",books);
        return "allBook";
    }
    @RequestMapping("/queryBookById")
    public String queryBookById(int id,Model model){
        Books books = bookService.queryBookById(id);
        List<Books> book=new ArrayList<>();//为了实现查询页面的复用，采用了封装技术
        book.add(books);
        model.addAttribute("books",book);
        return "allBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }
    @RequestMapping("/addBooks")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBooks";
    }
    @RequestMapping("/deleteBookById")
    public String deleteBookById(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBooks";
    }
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBooks",books);
        return "update";
    }
    @RequestMapping("/updateBook")
    public String UpdateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBooks";
    }
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String bookName,Model model){
        List<Books> books = bookService.queryBookByName(bookName);
        if(books.isEmpty()){
            books = bookService.queryAllBook();
        }
        model.addAttribute("books",books);
        return "allBook";
    }
}
