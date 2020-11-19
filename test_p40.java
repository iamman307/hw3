package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p40 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入字串");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String input =br1.readLine();
		System.out.println("請輸入要新增的文字");
		String plus=br1.readLine();
		StringBuffer space=new StringBuffer(input);
		space.append(plus);
		System.out.println("在「"+input+"」後新增「"+plus+"」的話，就會變成「"+space+"」。");
	}
}
