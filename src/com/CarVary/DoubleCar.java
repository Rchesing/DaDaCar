package com.CarVary;
//皮卡车
public class DoubleCar extends Car{
	public int getLoad() {
		return load;
	}

	
	public int getPeopleNum(){
		return peopleNum;
	}
	
	public void setPeopleNum(int peopleNum){
		this.peopleNum = peopleNum;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	private int peopleNum;//载客量
	private int load;//载货量
	
	public void describe(){
		System.out.println("序号："+getNum()+" 汽车名称："+getName()+
						" 租金："+getRent()+" 载客量:" +getPeopleNum()+" 载货量:"+getLoad());
	}
	public DoubleCar(){
		
	}
	public DoubleCar(int num,String name, int rent,int peopleNum,int load){
		this.setLoad(load);
		this.setName(name);
		this.setNum(num);
		this.setPeopleNum(peopleNum);
		this.setRent(rent);
	}
}

