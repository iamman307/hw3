package ch3test;

public class test_p9 {
	public static void main(String[] args)
	{
		ez car=new ez();
		car.num=1234;
		car.gas=20.5;
	}
}
class ez
{
	int num;
	double gas;
	void show()
	{
		System.out.println("car1車號是"+this.num);
		System.out.println("car1汽油量是"+this.gas);
	}
}
