package com.CarVary;
//����
public class Trunk extends Car {

	public int getLoad() {
		return load;
	}

	public void setLoad(int load2) {
		this.load = load2;
	}
	private int load;//�ػ���
	
	public void describe(){
		System.out.println("��ţ�"+getNum()+" �������ƣ�"+getName()+
						" ���"+getRent()+" �ػ���:"+getLoad());
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
