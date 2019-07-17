package mypro01;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class TestBoolean {
	public static void main(String[] ugrs) {
		double zhangsanscore= 88.8;
		System.out.println("请输入李四的成绩");
		Scanner input=new Scanner(System.in);
		double lisiscore=input.nextDouble();
		boolean isrusult=zhangsanscore>lisiscore;
		System.out.println("张三的分数比李四高吗？"+isrusult);
		System.out.println("现在对a=8，b=9做如下运算之后比较二者的关系：");
		System.out.println("请输入a的值");
		Scanner input2=new Scanner(System.in);
		double a=input2.nextDouble();
		System.out.println("请输入b的值");
		Scanner input3=new Scanner(System.in);
		double b=input3.nextDouble();
		System.out.println(a+">"+b+"?"+(a>=b));
		System.out.println(a+">="+b+"?"+(a>=b));
		System.out.println(a+"等于"+b+"?"+(a==b));
		System.out.println(a+"不等于"+b+"吗?"+(a!=b));
	}
}
