package ch3test;

import java.io.IOException;

public class test_p47 {
	public static void main(String[] args)throws IOException
	{
		p47car car =new p47car();
		car.show();
		car.setnumgas(1234, 20.5);
		car.setname("1����");
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
		name="�|���R�W";
		System.out.println("�Ͳ��F���l");
	}
	public void setnumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�N�T�o�q�]��"+gas);
	}
	public void setname(String st)
	{
		name=st;
		System.out.println("�N�W�ٳ]��"+name);
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q"+gas);
		System.out.println("���W��"+name);
	}
}