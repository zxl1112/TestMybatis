package com.mybatis.test;

import com.mybatis.pojo.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.xml.catalog.Catalog;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

public class TestMybatis {
public static void main(String[] args)throws IOException {
    InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session=sqlSessionFactory.openSession();
    List<Category>cs=session.selectList("listCategory");
    for(Category c:cs){
        System.out.println(c.getId());
    }
}
}
