package com.z.service;

import com.z.dao.BookDao;
import com.z.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImp implements BookService{
    @Autowired
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public int addBook(Books book) {
        return bookDao.addBook(book);
    }

    @Override
    public int updateBook(Books book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public Books queryBookById(int id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookDao.queryAllBook();
    }

    @Override
    public List<Books> queryBookByName(String bookName) {
        return bookDao.queryBookByName(bookName);
    }
}
