package ch3test;

public class test_p22 {
	public static void main(String[] args)
	{
		p22car car =new p22car();
		car.setnumgas(1234, 20.5);
		car.show();
		System.out.println("���w�����T���T�o�q{-10.0}�ݬ�");
		car.setnumgas(1234, -10.0);
		car.show();
	}
}
class p22car
{
	private int num;
	private double gas;
	public void setnumgas(int n,double g)
	{
		if(g>0&&g<100)
		{
			num=n;
			gas=g;
			System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
		}
		else
		{
			System.out.println(g+"���O���T���T�o�q\n�L�k�ܧ�T�o�q");
		}
	}
	public void show()
	{
		System.out.println("�����O"+this.num+"\n�T�o�q�O"+this.gas);
	}
}
