package mypro01;
public class Hellow {
	public static void main(String[] args) {
		//debug模式
		int a=5,b=3;
		int c=6,d=4;

		a=a+b;
		b=a-b;
		a=a-b;
		
		//^表示异或运算；开始c=0110；d=0100
		c=c^d;			//c=0010；
		d=c^d;			//d=0110；
		c=c^d;			//c=0100；
		
		System.out.println("a="+a+"; b="+b);
		System.out.println("c="+c+"; d="+d);
	}
}