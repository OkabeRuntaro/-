package com.woniu.Dome4;

public class User {
private Integer uid;
private String uname;
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + "]";
}


}
