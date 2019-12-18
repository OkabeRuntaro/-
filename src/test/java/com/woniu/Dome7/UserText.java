package com.woniu.Dome7;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean����������
 * 1.����bean�е��޲ι�����
 * 2.ʹ��set����ע��
 * 3.bean��Ӧ����ʵ����BeanNameAwaer�ӿ�,����д������setBeanName����,����ֱ������
 * 4.Bean�Ƿ�ʵ��BeanFactoryAware�ӿ�,����д������setBeanFactory����,����ֱ������
 * 5.Bean�Ƿ�ʵ��ApplicationContextAware�ӿ�
 * 6.�ж�Bean�Ƿ����BeanPostProfessor�ӿ� before
 * 7.Bean�Ƿ�ʵ�ֳ�ʼ��Bean�Ľӿ�
 * 8.��xml�Ƿ�����init-method
 * 9.�ж�Bean�Ƿ����BenaPostProfessor�ӿ� after
 * 10.
 * 
 * @author ������������
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
