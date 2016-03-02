package com.CarVary;
//客车
public class Ccar extends Car{
	
	private int peopleNum;//载客量
	
	public int getPeopleNum(){
		return peopleNum;
	}
	
	public void setPeopleNum(int peopleNum){
		this.peopleNum = peopleNum;
	}
	
	public void describe(){
		System.out.println("序号："+getNum()+" 汽车名称："+getName()+
						" 租金："+getRent()+" 载客量:" +getPeopleNum());
	}
	public Ccar(){
		
	}
	public Ccar(int num,String name, int rent,int peopleNum){
		this.setName(name);
		this.setNum(num);
		this.setPeopleNum(peopleNum);
		this.setRent(rent);
	}
}
