package ch3test;

public class test_p28 {
	public static void main(String[] args)
	{
		p28car car1=new p28car();
		car1.show();
		
		p28car car2=new p28car(1234,25.0);
		car2.show();
	}
}
class p28car
{
	private int num;
	private double gas;
	public p28car()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public p28car(int n,double g)
	{
		gas=g;
		num=n;
		System.out.println("生產了車號為"+num+"，生產了汽油量為"+gas);
	}
	public void show()
	{
		System.out.println("車號為"+this.num+"\n油量為"+this.gas);
	}
}
