package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p43 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J��Ӿ��:");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String input1 =br1.readLine();
		String input2 =br1.readLine();
		
		int num1=Integer.parseInt(input1);
		int num2=Integer.parseInt(input2);
		
		
		int larger=Math.max(num1, num2);
		System.out.println(num1+"�P"+num2+"�����j���O"+larger);
	}
}
