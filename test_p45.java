package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p45 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("�ŧi�Fcar1");
		p45car car1 =new p45car();
		car1.setnumgas(1234, 20.5);
		System.out.println("�ŧi�Fcar2");
		p45car car2 =new p45car();
		
		System.out.println("�Ncar1���w��car2");
		car2=car1;
		
		System.out.print("car1��");
		car1.show();
		
		System.out.print("car2��");
		car2.show();
		
		System.out.println("����car1���������");
		car1.setnumgas(2345, 30.5);
		
		System.out.print("car1��");
		car1.show();
		
		System.out.print("car2��");
		car2.show();
	}
}
class p45car
{
	private int num;
	private double gas;
	public p45car()
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
