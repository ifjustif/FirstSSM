package com.z.service;

import com.z.pojo.Books;

import java.util.List;

public interface BookService {
    //添加一本书
    public int addBook(Books book);
    //修改一本书
    public int updateBook(Books book);
    //删除一本书
    public int deleteBookById(int id);
    //根据ID查询一本书
    public Books queryBookById(int id);
    //查询全部书籍
    public List<Books> queryAllBook();
    //根据名称查书籍
    public List<Books> queryBookByName(String bookName);
}
