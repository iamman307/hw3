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