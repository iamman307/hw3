package ch3test;

public class test_p24 {
	public static void main(String[] args)
	{
		p24car car=new p24car();
		car.setnumgas(1234,20.5);
		car.show();
		
		System.out.println("�u�ܧ󨮸�");
		car.setnum(2345);
		car.show();
		
		System.out.println("�u�ܧ�T�o�q");
		car.setcar(30.5);
		car.show();
	}
}
class p24car
{
	private int num;
	private double gas;
	public void setcar(double g)
	{
		gas=g;
		System.out.println("�N�o�q�]��"+gas);
	}
	public void setnum(int n)
	{
		num=n;
		System.out.println("�N�����]��"+num);
	}
	public void setnumgas(int n,double g)
	{
		gas=g;
		num=n;
		System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	public void show()
	{
		System.out.println("������"+this.num+"\n�o�q��"+this.gas);
	}
}
