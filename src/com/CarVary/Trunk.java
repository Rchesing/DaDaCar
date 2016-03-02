package com.CarVary;
//货车
public class Trunk extends Car {

	public int getLoad() {
		return load;
	}

	public void setLoad(int load2) {
		this.load = load2;
	}
	private int load;//载货量
	
	public void describe(){
		System.out.println("序号："+getNum()+" 汽车名称："+getName()+
						" 租金："+getRent()+" 载货量:"+getLoad());
	}
	public Trunk(){
		
	}
	public Trunk(int num,String name,int rent,int load){
		this.setName(name);
		this.setLoad(load);
		this.setNum(num);
		this.setRent(rent);
	}
	
}
