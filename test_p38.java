package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p38 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J�r��");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String input =br1.readLine();
		System.out.println("�п�J�n�˯�����r");
		String search=br1.readLine();
		char ch=search.charAt(0);
		int num =input.indexOf(ch);
		
		if(num!=-1)
			System.out.println(input+"����"+(num+1)+"�Ӧr�N�O�u"+ch+"�v");
		else
			System.out.println(input+"���S���u"+ch+"�v�o�Ӧr");
	}
}
