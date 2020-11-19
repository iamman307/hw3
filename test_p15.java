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
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
