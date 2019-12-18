package com.woniu.Dome7;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的生命周期
 * 1.调用bean中的无参构造器
 * 2.使用set方法注入
 * 3.bean对应的类实现了BeanNameAwaer接口,会重写并调用setBeanName方法,否则直接跳过
 * 4.Bean是否实现BeanFactoryAware接口,会重写并调用setBeanFactory方法,否则直接跳过
 * 5.Bean是否实现ApplicationContextAware接口
 * 6.判断Bean是否关联BeanPostProfessor接口 before
 * 7.Bean是否实现初始化Bean的接口
 * 8.在xml是否配置init-method
 * 9.判断Bean是否关联BenaPostProfessor接口 after
 * 10.
 * 
 * @author 哈哈哈哈哈哈
 *
 */
public class UserText {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/Dome7/applicationContext.xml");
		User u = (User) ac.getBean("user");
		System.out.println(u);
	}

}
