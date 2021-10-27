package com.spring5.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

//四个注解
//@Component
@Service
//@Controller
//value可省略，其值为类的名称+首字母小写
//@Repository(value = "myService") //等同于<bean id="myService" class=".." />
public class MyService {
//    @Autowired //根据类型进行注入
//    @Qualifier(value = "myDaoImpl1")//根据名称进行注入，要和Autowired一起使用，value值对于实现类的value值，不需要set方法
//    private MyDao myDao;

//    @Resource//可根据类型进行注入
    @Resource(name = "myDaoImpl1")//也可根据名称进行注入，但是是javax包（java扩展包）中的注解，spring不推荐使用
    private MyDao myDao;

    @Value(value = "abc")//对基本类型进行注入
    private String name;
    public void add(){
        System.out.println("add ...." + name);
        myDao.add();
    }


}
