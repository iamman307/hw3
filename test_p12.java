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
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
	void showca()
	{
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
}
