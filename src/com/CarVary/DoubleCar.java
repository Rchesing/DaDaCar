package com.CarVary;
//Ƥ����
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
	private int peopleNum;//�ؿ���
	private int load;//�ػ���
	
	public void describe(){
		System.out.println("��ţ�"+getNum()+" �������ƣ�"+getName()+
						" ���"+getRent()+" �ؿ���:" +getPeopleNum()+" �ػ���:"+getLoad());
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

