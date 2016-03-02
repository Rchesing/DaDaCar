package RentSystem;

import java.util.Scanner;

import com.CarVary.Car;
import com.CarVary.Ccar;
import com.CarVary.DoubleCar;
import com.CarVary.Trunk;

/**
	 * 控制台版的答答租车系统
	功能：
	1.展示所有可租车辆
	2.选择车型、租车量
	3.展示租车清单，包含：总金额、总载货量及其车型、总载人量以及车型
	项目分析：
	1.数据模型分析【集成度较高】（把生活中的事提取成数据结构：操作（方法）、属性）
	载客车（载客量）：小客车（5人以下）、大客车（10人以上）
	载货车（载货量）：轻型车（5吨）、重型车（5吨-20吨）
	既能载货又能载客（载客量和载货量）
	2.业务模型分析（考虑用户选车、租车天数、统计金额、载客、货量）
	3.显示和流程分析（Scanner）：请选择车辆->请输入序号->输出总金额
	
	//数据参考：
	欢迎使用答答租车系统：
	您是否要租车：1是0否
	1
	您可租车的类型及其价目表：
	序号	汽车名称	租金	容量
	1. 	奥迪A4	500元/天	载人：4人
	2. 	马自达6	400元/天	载人：4人
	3. 	皮卡雪6	450元/天	载人：4人 载货：2吨
	4. 	金龙	800元/天	载人：20人
	5. 	松花江	400元/天	载货：4吨
	6. 	依维柯 	1000元/天	载货：20吨
	请输入您要租汽车的数量：
	4
	请输入第1辆车的序号：
	1
	请输入第2辆车的序号：
	2
	请输入第3辆车的序号：
	3
	请输入第4辆车的序号：
	4
	请输入租车天数：
	3
	您的账单：
	***可载人的车有：
	奥迪A4 马自达6 皮卡雪6 金龙 共载人：32人
	***载货的车有：
	皮卡雪6 共载货：2.0吨
	***租车总价格：6450.0元*/
public class Rent {
 
	@SuppressWarnings("resource")
	public static void main(String[] args){	Car[] car = {
			new Ccar(1,"奥迪A4",500,4),
			new Ccar(2,"马自达6",400,4),
			new DoubleCar(3,"皮卡雪6",450,4,2),
			new Ccar(4,"金龙",800,20),
			new Trunk(5,"松花江",400,4),
			new Trunk(6,"依维柯",1000,20)
	}; 
		System.out.println("欢迎使用答答租车系统：");
		System.out.println("您是否要租车：1是0否");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if(result==1){
			System.out.println("序号 汽车名称 租金 容量");
			for(int i=0;i<car.length;i++){
				System.out.print(car[i].getNum()+" "+car[i].getName()+" "+car[i].getRent()+"元/天");
				if(car[i].getPeopleNum()==0&&car[i].getLoad()>0){
					System.out.println(car[i].getLoad()+"吨");
				}
				if(car[i].getPeopleNum()>0&&car[i].getLoad()>0){
					System.out.println(car[i].getPeopleNum()+"人"+car[i].getLoad()+"吨");
				}
				if(car[i].getPeopleNum()>0&&car[i].getLoad()==0){
					System.out.println(car[i].getPeopleNum()+"人");				
				}
			}
			
			System.out.println("请输入您要租汽车的数量:");
			Scanner sc1 = new Scanner(System.in);
			int result1 = sc1.nextInt();
			int carNum[] = new int[result1];
			for(int i = 0; i<result1;i++){
				int j=i+1;
				System.out.println("请输入第"+j+"辆车的序号：");
				carNum[i]=new Scanner(System.in).nextInt()-1;
			}
			
			System.out.println("请输入租车天数：");
			int day = new Scanner(System.in).nextInt();

			System.out.println("您的账单：");
			
			System.out.println("***可载人的车有：");
			int Apeople=0;
			for(int i=0;i<result1;i++){
				if(car[carNum[i]].getPeopleNum()>0)
					System.out.print(car[carNum[i]].getName()+" ");
					Apeople+=car[carNum[i]].getPeopleNum();
			}
			System.out.println("共载人："+Apeople+"人");
			
			System.out.println("***载货的车有：");	
			int Aload=0;
			for(int i=0;i<result1;i++){
				if(car[carNum[i]].getLoad()>0)
					System.out.print(car[carNum[i]].getName()+" ");
					Aload+=car[carNum[i]].getLoad();
			}
			System.out.println("共载货："+Aload+"吨");
			
			int Arent = 0;
			for(int i = 0 ;i< result1;i++){
				Arent += car[carNum[i]].getRent()*day;
			}
			System.out.print("***租车总价格："+Arent+"元"+"*/");
		}
	}
}
