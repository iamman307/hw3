package ch3test;

import java.io.IOException;

public class test_p47 {
	public static void main(String[] args)throws IOException
	{
		p47car car =new p47car();
		car.show();
		car.setnumgas(1234, 20.5);
		car.setname("1號車");
		car.show();
	}
}
class p47car
{
	private int num;
	private double gas;
	private String name;
	public p47car() 
	{
		num=0;
		gas=0.0;
		name="尚未命名";
		System.out.println("生產了車子");
	}
	public void setnumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	public void setname(String st)
	{
		name=st;
		System.out.println("將名稱設為"+name);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量"+gas);
		System.out.println("車名為"+name);
	}
}