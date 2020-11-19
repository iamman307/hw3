package ch3test;

public class test_p24 {
	public static void main(String[] args)
	{
		p24car car=new p24car();
		car.setnumgas(1234,20.5);
		car.show();
		
		System.out.println("只變更車號");
		car.setnum(2345);
		car.show();
		
		System.out.println("只變更汽油量");
		car.setcar(30.5);
		car.show();
	}
}
class p24car
{
	private int num;
	private double gas;
	public void setcar(double g)
	{
		gas=g;
		System.out.println("將油量設為"+gas);
	}
	public void setnum(int n)
	{
		num=n;
		System.out.println("將車號設為"+num);
	}
	public void setnumgas(int n,double g)
	{
		gas=g;
		num=n;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號為"+this.num+"\n油量為"+this.gas);
	}
}
