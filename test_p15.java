package ch3test;

public class test_p15 {
	public static void main(String[] args)
	{
		finalcar car1 =new finalcar();
		car1.setNumgas(1234,20.5);
	}
}
class finalcar
{
	int num;
	double gas;
	void setNumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
