package ch3test;

public class test_p12 {
	public static void main(String[] args)
	{
		caca car1 =new caca();
		car1.num=1234;
		car1.gas=20.5;
		car1.showca();
	}
}
class caca
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
	void showca()
	{
		System.out.println("開始顯示車子資料");
		this.show();
	}
}
