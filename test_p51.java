package ch3test;

import java.io.IOException;

public class test_p51 {
	public static void main(String[] args)throws IOException
	{
		p51car[] car=new p51car[3];
	for(int i=0;i<car.length;i++)
		car[i]=new p51car();
	car[0].setnumgas(1234, 20.5);
	car[1].setnumgas(2345, 30.5);
	car[2].setnumgas(3456, 40.5);
	for(int i=0;i<car.length;i++)
		car[i].show();
	}
}
class p51car
{
	private int num;
	private double gas;
	public p51car() 
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setnumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�N�T�o�q�]��"+gas);
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q"+gas);
	}
}