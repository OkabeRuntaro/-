package com.woniu.Dome2;

import org.junit.Test;

public class AppTest {
@Test
	public void tset() {
		MyApplicationContext mac = new MyClassPathXmlApplicationContext("com/woniu/Dome2/app.xml");
			Dept dept = (Dept) mac.getBean("d1");
			System.out.println(dept);
		
	}
}
