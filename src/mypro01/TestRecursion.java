package mypro01;
//测试递归（耗时，耗空间的算法）


public class TestRecursion {
	static int a=0;
	public static void test01() {
		a++;
		System.out.println("test01:"+a);
		if(a<10) {				//递归头（什么时候要调用自己）
		test01();				//在test01方法中调用test02
		}else {					//递归体（什么时候停止调用自己）
		test02();
		}
	}
	public static void test02() {
		System.out.println("over");
		//test02();				自己调用自己就称为递归。出现死循环，栈溢出
	}
	
	
	public static long factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		test01();
	//应用题：用递归方法计算阶乘
		System.out.println(factorial(10));
	
	
	}
}
