package com.z.dao;

import com.z.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {
    //添加一本书
    public int addBook(Books book);
    //修改一本书
    public int updateBook(Books book);
    //删除一本书
    public int deleteBookById(@Param("bookId")int id);
    //根据ID查询一本书
    public Books queryBookById(@Param("bookId")int id);
    //查询全部书籍
    public List<Books> queryAllBook();
    //根据名字查询书籍
    public List<Books> queryBookByName(String bookName);
}
