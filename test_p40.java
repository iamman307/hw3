package ch3test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p40 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J�r��");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String input =br1.readLine();
		System.out.println("�п�J�n�s�W����r");
		String plus=br1.readLine();
		StringBuffer space=new StringBuffer(input);
		space.append(plus);
		System.out.println("�b�u"+input+"�v��s�W�u"+plus+"�v���ܡA�N�|�ܦ��u"+space+"�v�C");
	}
}
