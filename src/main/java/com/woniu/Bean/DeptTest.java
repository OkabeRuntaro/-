package com.woniu.Bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DeptTest {

	@Test
    public void Test(){
        //从spring容器获得
        //1 获得容器
        String xmlPath = "com/woniu/Bean/application.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //2获得内容 --不需要自己new，都是从spring容器获得
        Dept bean = (Dept) applicationContext.getBean("dept");
        System.out.println(bean);
}
}