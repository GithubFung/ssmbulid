package com.feng.service;

import com.feng.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 小冯 on 2022/8/15 22:00
 */
//业务
public interface BookService {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部书
    List<Books> queryAllBook();

    //查询书籍
    Books queryBookByName(String bookName);
}
