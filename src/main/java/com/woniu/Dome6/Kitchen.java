package com.woniu.Dome6;

public interface Kitchen {
	void cook();
}

class Fish implements Kitchen {
@Override
public void cook() {
	// TODO Auto-generated method stub
	System.out.println("������");
	}
}
class Meat implements Kitchen {
@Override
public void cook() {
	// TODO Auto-generated method stub
	System.out.println("������");
	}
}
