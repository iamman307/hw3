package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J�@�Ӿ��");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String st=br1.readLine();
		int num=Integer.parseInt(st);
		System.out.println("�A��J���Ʀr�O"+num);
	}
}
