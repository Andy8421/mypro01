package mypro01;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class TestBoolean {
	public static void main(String[] ugrs) {
		double zhangsanscore= 88.8;
		System.out.println("���������ĵĳɼ�");
		Scanner input=new Scanner(System.in);
		double lisiscore=input.nextDouble();
		boolean isrusult=zhangsanscore>lisiscore;
		System.out.println("�����ķ��������ĸ���"+isrusult);
		System.out.println("���ڶ�a=8��b=9����������֮��Ƚ϶��ߵĹ�ϵ��");
		System.out.println("������a��ֵ");
		Scanner input2=new Scanner(System.in);
		double a=input2.nextDouble();
		System.out.println("������b��ֵ");
		Scanner input3=new Scanner(System.in);
		double b=input3.nextDouble();
		System.out.println(a+">"+b+"?"+(a>=b));
		System.out.println(a+">="+b+"?"+(a>=b));
		System.out.println(a+"����"+b+"?"+(a==b));
		System.out.println(a+"������"+b+"��?"+(a!=b));
	}
}
