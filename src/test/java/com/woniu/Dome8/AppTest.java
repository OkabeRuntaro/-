package com.woniu.Dome8;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "ApplicationContext.xml")
public class AppTest {
	@Autowired
	DeptServiceImpl dsi;
	@Test
	public void test() {
		dsi.save();
	}

}
