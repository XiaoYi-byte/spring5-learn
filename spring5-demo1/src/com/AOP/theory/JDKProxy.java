package com.AOP.theory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao proxyInstance = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println(proxyInstance.add(1, 2));
    }
}

class UserDaoProxy implements InvocationHandler{

    //传递代理对象
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }
    //增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法"+method.getName()+"调用前");
        //调用方法
        Object res = method.invoke(obj, args);
        return res;
    }
}