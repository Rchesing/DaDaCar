package RentSystem;

import java.util.Scanner;

import com.CarVary.Car;
import com.CarVary.Ccar;
import com.CarVary.DoubleCar;
import com.CarVary.Trunk;

/**
	 * ����̨��Ĵ���⳵ϵͳ
	���ܣ�
	1.չʾ���п��⳵��
	2.ѡ���͡��⳵��
	3.չʾ�⳵�嵥���������ܽ����ػ������䳵�͡����������Լ�����
	��Ŀ������
	1.����ģ�ͷ��������ɶȽϸߡ����������е�����ȡ�����ݽṹ�������������������ԣ�
	�ؿͳ����ؿ�������С�ͳ���5�����£�����ͳ���10�����ϣ�
	�ػ������ػ����������ͳ���5�֣������ͳ���5��-20�֣�
	�����ػ������ؿͣ��ؿ������ػ�����
	2.ҵ��ģ�ͷ����������û�ѡ�����⳵������ͳ�ƽ��ؿ͡�������
	3.��ʾ�����̷�����Scanner������ѡ����->���������->����ܽ��
	
	//���ݲο���
	��ӭʹ�ô���⳵ϵͳ��
	���Ƿ�Ҫ�⳵��1��0��
	1
	�����⳵�����ͼ����Ŀ��
	���	��������	���	����
	1. 	�µ�A4	500Ԫ/��	���ˣ�4��
	2. 	���Դ�6	400Ԫ/��	���ˣ�4��
	3. 	Ƥ��ѩ6	450Ԫ/��	���ˣ�4�� �ػ���2��
	4. 	����	800Ԫ/��	���ˣ�20��
	5. 	�ɻ���	400Ԫ/��	�ػ���4��
	6. 	��ά�� 	1000Ԫ/��	�ػ���20��
	��������Ҫ��������������
	4
	�������1��������ţ�
	1
	�������2��������ţ�
	2
	�������3��������ţ�
	3
	�������4��������ţ�
	4
	�������⳵������
	3
	�����˵���
	***�����˵ĳ��У�
	�µ�A4 ���Դ�6 Ƥ��ѩ6 ���� �����ˣ�32��
	***�ػ��ĳ��У�
	Ƥ��ѩ6 ���ػ���2.0��
	***�⳵�ܼ۸�6450.0Ԫ*/
public class Rent {
 
	@SuppressWarnings("resource")
	public static void main(String[] args){	Car[] car = {
			new Ccar(1,"�µ�A4",500,4),
			new Ccar(2,"���Դ�6",400,4),
			new DoubleCar(3,"Ƥ��ѩ6",450,4,2),
			new Ccar(4,"����",800,20),
			new Trunk(5,"�ɻ���",400,4),
			new Trunk(6,"��ά��",1000,20)
	}; 
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵��1��0��");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if(result==1){
			System.out.println("��� �������� ��� ����");
			for(int i=0;i<car.length;i++){
				System.out.print(car[i].getNum()+" "+car[i].getName()+" "+car[i].getRent()+"Ԫ/��");
				if(car[i].getPeopleNum()==0&&car[i].getLoad()>0){
					System.out.println(car[i].getLoad()+"��");
				}
				if(car[i].getPeopleNum()>0&&car[i].getLoad()>0){
					System.out.println(car[i].getPeopleNum()+"��"+car[i].getLoad()+"��");
				}
				if(car[i].getPeopleNum()>0&&car[i].getLoad()==0){
					System.out.println(car[i].getPeopleNum()+"��");				
				}
			}
			
			System.out.println("��������Ҫ������������:");
			Scanner sc1 = new Scanner(System.in);
			int result1 = sc1.nextInt();
			int carNum[] = new int[result1];
			for(int i = 0; i<result1;i++){
				int j=i+1;
				System.out.println("�������"+j+"��������ţ�");
				carNum[i]=new Scanner(System.in).nextInt()-1;
			}
			
			System.out.println("�������⳵������");
			int day = new Scanner(System.in).nextInt();

			System.out.println("�����˵���");
			
			System.out.println("***�����˵ĳ��У�");
			int Apeople=0;
			for(int i=0;i<result1;i++){
				if(car[carNum[i]].getPeopleNum()>0)
					System.out.print(car[carNum[i]].getName()+" ");
					Apeople+=car[carNum[i]].getPeopleNum();
			}
			System.out.println("�����ˣ�"+Apeople+"��");
			
			System.out.println("***�ػ��ĳ��У�");	
			int Aload=0;
			for(int i=0;i<result1;i++){
				if(car[carNum[i]].getLoad()>0)
					System.out.print(car[carNum[i]].getName()+" ");
					Aload+=car[carNum[i]].getLoad();
			}
			System.out.println("���ػ���"+Aload+"��");
			
			int Arent = 0;
			for(int i = 0 ;i< result1;i++){
				Arent += car[carNum[i]].getRent()*day;
			}
			System.out.print("***�⳵�ܼ۸�"+Arent+"Ԫ"+"*/");
		}
	}
}
