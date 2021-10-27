package com.spring5.service;

import com.spring5.dao.BookDao;
import com.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
/*propagation：事务传播行为，有事务的方法调用没事务的方法或者没事务的方法调用有事务的方法等等应该如何处理事务
*       最常用的两个参数：REQUIRED（默认）、REQUIRED_NEW
*       REQUIRED:例如add方法有事务，调用了update方法，则update方法使用add方法中的事务，否则就创建一个新事务
*       REQUIRED_NEW：不管add方法有没有事务在调用update方法后都创建一个新事务
*
* isolation: 事务隔离级别
*       事务之间存在读问题：脏读（T1将某一值修改，然后事务T2读取该值，此后T1因为某种原因撤销对该值的修改，
*                           这就导致了T2所读取到的数据是无效的，值得注意的是，脏读一般是针对于update操作的。）
*                       不可重复读（一个未提交事务读取到另一个提交事务修改的数据）
*                       虚（幻）读（一个未提交事务读取到另一个提交事务添加的数据）
*       参数：
*               READ_UNCOMMITTED: 存在111
*               READ_COMMITTED: 存在011
*               REPEATABLE_READ（默认）: 存在001
*               SERIALIZABLE: 存在000
* timeout: 超过该时间事务未提交则进行回滚，以秒为单位，默认为-1，即不进行回滚
* readOnly: 是否可读，默认为false，为true时则只能对数据进行查询，不可插入删除更新
* rollbackFor: 设置出现哪些异常进行回滚，值为异常.class
* noRollbackFor: 设置出现哪些异常不进行回滚，值为异常.class*/
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = 5)
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
//        try {
//            /*以下几位编程式事务管理，一般使用声明式事务管理（基于注解和XML）*/
//            //1.开启事务
//            //2.业务操作
//            //3.未发生异常，提交事务
//        }catch (Exception e){
//            //4.发生异常，事务回滚
//        }
    }
}
