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
		System.out.println("car1�����O"+this.num);
		System.out.println("car1�T�o�q�O"+this.gas);
	}
}
