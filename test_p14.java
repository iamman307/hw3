package ch3test;

public class test_p14 {
	public static void main(String[] args)
	{
		hicar car1 =new hicar();
		car1.setNum(1234);
		car1.setgas(20.5);
	}
}
class hicar
{
	int num;
	double gas;
	void setNum(int n)
	{
		num=n;
		System.out.println("�N�����]��"+num);
	}
	void setgas(double g)
	{
		gas=g;
		System.out.println("�N�T�o�q�]��"+gas);
	}
}
