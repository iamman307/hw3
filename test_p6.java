package ch3test;

public class test_p6 {
	public static void main(String[] args)
	{
		baba car1=new baba();
		car1.num=1234;
		car1.gas=20.5;
		System.out.println("�����O"+car1.num);
		System.out.println("�T�o�q�O"+car1.gas);
	}
}
class baba
{
	int num;
	double gas;
}