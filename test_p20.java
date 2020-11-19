package ch3test;

public class test_p20 {
	public static void main(String[] args)
	{
		p20car car =new p20car();
		car.num=1234;
		car.gas=-10;
		car.show();
	}
}
class p20car
{
	int num;
	double gas;
	void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}
