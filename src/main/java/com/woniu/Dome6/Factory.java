package com.woniu.Dome6;

public class Factory {

	public static Kitchen getKitchen(Integer type) {
		Kitchen k = null;
		switch (type) {
		case 1:
			k = new Fish();
			break;

		case 2:
			k = new Meat();
			break;
		}
		return k;
		
	}
}
