package com.woniu.Dome6;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KitchenTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/Dome6/applicationContext.xml");
		Kitchen k = (Kitchen) ac.getBean("k");
		k.cook();
	}

}
