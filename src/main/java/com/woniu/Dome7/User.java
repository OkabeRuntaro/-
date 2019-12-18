package com.woniu.Dome7;

import org.springframework.beans.factory.BeanNameAware;

/*
 * bean的生命周期
 */
public class User implements BeanNameAware{
private Integer uid;
private String uname;

public User() {
	System.out.println("bean已经来过无参构造器了");
}
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	System.out.println("我来过SetUid");
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	System.out.println("我来过SetUname");
	this.uname = uname;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + "]";
}
@Override
public void setBeanName(String name) {
	// TODO Auto-generated method stub
	System.out.println("我来过setBeanName");
}

}
