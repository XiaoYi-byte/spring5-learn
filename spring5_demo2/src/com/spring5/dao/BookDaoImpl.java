package com.spring5.dao;

import com.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql="insert into t_book values(?,?,?)";
        Object args[] = {book.getId(), book.getName(), book.getStatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
        //删除和修改类似
    }

    //查询某个值
    public int selectCount(){
        String sql = "select count(*) from t_book";
        //第二个参数为返回值的类型
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    //查询返回对象（如根据id查询图书的所有信息）
    public Book findOne(String id){
        String sql = "select * from t_book where id=?";
        //第二个参数为RowMapper接口的实现类，通过该实现类可以完成数据封装
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //查询返回集合
    public List<Book> findAll(){
        String sql = "select * from t_book";
        //同上，也可以有第三个参数
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    //批量添加
    public void addBatch(List<Object[]> batchArgs){
        String sql ="insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

        //批量删除和修改类似，只不过需要注意参数的顺序
    }
}
