package ch3test;

public class test_p17 {
	public static void main(String[] args)
	{
		newcar car1 =new newcar();
		car1.setNumgas(1234,20.5);
		int number=car1.getNun();
		double gg=car1.getgas();
		System.out.println("�լd�˫~���ɱo��\n�����O"+number+"�A�T�o�q�O"+gg);
	}
}
class newcar
{
	int num;
	double gas;
	int getNun()
	{
		System.out.println("�լd����");
		return num;
	}
	double getgas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
	void setNumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	
}