package com.feng.dao;

import com.feng.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 小冯 on 2022/8/15 21:37
 */
//接口操作
public interface BookMapper {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("id") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("id") int id);

    //查询全部的书
    List<Books> queryAllBook();
}
