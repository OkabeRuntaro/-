package com.woniu.Bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DeptTest {

	@Test
    public void Test(){
        //��spring�������
        //1 �������
        String xmlPath = "com/woniu/Bean/application.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //2������� --����Ҫ�Լ�new�����Ǵ�spring�������
        Dept bean = (Dept) applicationContext.getBean("dept");
        System.out.println(bean);
}
}