package ch3test;

public class test_p31 {
	public static void main(String[] args)
	{
		p31car.showsum();
		p31car car1=new p31car();
		car1.setnumgas(1234, 20.5);
		p31car.showsum();
		p31car car2=new p31car();
		car2.setnumgas(4567, 30.5);
		
	}
}
class p31car
{
	public static int sum=0;
	private int num;
	private double gas;
	public p31car()
	{
		sum+=1;
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setnumgas(int n,double g)
	{
		gas=g;
		num=n;
		System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	public static void showsum()
	{
		System.out.println("���l�@��"+sum+"�x");
	}
	public void show()
	{
		System.out.println("������"+this.num+"\n�o�q��"+this.gas);
	}
}
