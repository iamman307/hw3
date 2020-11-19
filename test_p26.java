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
		System.out.println("生產了車子");
	}
	public void show()
	{
		System.out.println("車號為"+this.num+"\n油量為"+this.gas);
	}
}