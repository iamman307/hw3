package ch3test;

public class test_p22 {
	public static void main(String[] args)
	{
		p22car car =new p22car();
		car.setnumgas(1234, 20.5);
		car.show();
		System.out.println("指定不正確的汽油量{-10.0}看看");
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
			System.out.println("將車號設為"+num+"汽油量設為"+gas);
		}
		else
		{
			System.out.println(g+"不是正確的汽油量\n無法變更汽油量");
		}
	}
	public void show()
	{
		System.out.println("車號是"+this.num+"\n汽油量是"+this.gas);
	}
}
