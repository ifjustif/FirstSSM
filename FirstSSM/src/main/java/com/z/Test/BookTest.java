package com.z.Test;

import com.z.pojo.Books;
import com.z.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService=(BookService)ac.getBean("BookService");
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }
    }
}
