package com.feng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 小冯 on 2022/8/15 21:30
 */
//构建实体类，数据库名叫books，实体名也叫Books
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    //与数据库属性名一致
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
