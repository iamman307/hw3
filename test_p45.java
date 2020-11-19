package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p45 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("宣告了car1");
		p45car car1 =new p45car();
		car1.setnumgas(1234, 20.5);
		System.out.println("宣告了car2");
		p45car car2 =new p45car();
		
		System.out.println("將car1指定給car2");
		car2=car1;
		
		System.out.print("car1的");
		car1.show();
		
		System.out.print("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setnumgas(2345, 30.5);
		
		System.out.print("car1的");
		car1.show();
		
		System.out.print("car2的");
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
		System.out.println("生產了車子");
	}
	public void setnumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量"+gas);
	}
}
