package com.woniu.Dome2;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DeptTest {

	@Test
	public void test() {
//		ApplicationContext ac = new FileSystemXmlApplicationContext("E:/app.xml");
//		Dept dept1 = (Dept) ac.getBean("d1");
//		
// 		Dept dept = (Dept) ac.getBean("d2");
//		System.out.println(dept1);
//		System.out.println("=========");
//		System.out.println(dept);
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/woniu/Dome2/app.xml"));
		while((boolean) bf.getBean("d1")) {
			
		}
		Dept dept = (Dept) bf.getBean("d1");
		System.out.println(dept);
		ApplicationContext ac = new FileSystemXmlApplicationContext("");
	}

}
