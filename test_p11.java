package ch3test;

public class test_p11 {
	public static void main(String[] args)
	{
		bus car1 =new bus();
		car1.num=1234;
		car1.gas=20.5;
		car1.show();
		car1.show();
	}
}
class bus
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
