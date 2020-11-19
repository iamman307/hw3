package ch3test;

public class test_p17 {
	public static void main(String[] args)
	{
		newcar car1 =new newcar();
		car1.setNumgas(1234,20.5);
		int number=car1.getNun();
		double gg=car1.getgas();
		System.out.println("調查樣品車時得知\n車號是"+number+"，汽油量是"+gg);
	}
}
class newcar
{
	int num;
	double gas;
	int getNun()
	{
		System.out.println("調查車號");
		return num;
	}
	double getgas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	void setNumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	
}