package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p38 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入字串");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String input =br1.readLine();
		System.out.println("請輸入要檢索的文字");
		String search=br1.readLine();
		char ch=search.charAt(0);
		int num =input.indexOf(ch);
		
		if(num!=-1)
			System.out.println(input+"的第"+(num+1)+"個字就是「"+ch+"」");
		else
			System.out.println(input+"中沒有「"+ch+"」這個字");
	}
}
