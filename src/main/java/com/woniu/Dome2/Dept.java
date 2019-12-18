package com.woniu.Dome2;

public class Dept {
	private Integer depton;

	public Dept() {
		
	}
	public Dept(Integer depton) {
		this.depton = depton;
	}
	public Integer getDepton() {
		return depton;
	}

	public void setDepton(Integer depton) {
		this.depton = depton;
	}

	@Override
	public String toString() {
		return "Dept [depton=" + depton + "]";
	}
	
}
