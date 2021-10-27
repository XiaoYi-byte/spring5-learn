package com.spring5.factoryBean;

import com.spring5.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/* 工厂bean，xml文件中定义的类类型和返回类型可以不一致 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCName("123");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
