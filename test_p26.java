package ch3test;

public class test_p26 {
	public static void main(String[] args)
	{
		p26car car=new p26car();
		car.show();
	}
}
class p26car
{
	private int num;
	private double gas;
	public p26car()
	{
		num=0;
		gas=0;
		System.out.println("�Ͳ��F���l");
	}
	public void show()
	{
		System.out.println("������"+this.num+"\n�o�q��"+this.gas);
	}
}