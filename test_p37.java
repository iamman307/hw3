package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p37 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J�^��r��");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String st=br1.readLine();
		String stru=st.toUpperCase();
		String strl=st.toLowerCase();
		System.out.println("�ഫ���j�g��"+stru);
		System.out.println("�ഫ���p�g��"+strl);
	}
}
