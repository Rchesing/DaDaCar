package com.CarVary;
//�ͳ�
public class Ccar extends Car{
	
	private int peopleNum;//�ؿ���
	
	public int getPeopleNum(){
		return peopleNum;
	}
	
	public void setPeopleNum(int peopleNum){
		this.peopleNum = peopleNum;
	}
	
	public void describe(){
		System.out.println("��ţ�"+getNum()+" �������ƣ�"+getName()+
						" ���"+getRent()+" �ؿ���:" +getPeopleNum());
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
