package mypro01;
//���Եݹ飨��ʱ���Ŀռ���㷨��


public class TestRecursion {
	static int a=0;
	public static void test01() {
		a++;
		System.out.println("test01:"+a);
		if(a<10) {				//�ݹ�ͷ��ʲôʱ��Ҫ�����Լ���
		test01();				//��test01�����е���test02
		}else {					//�ݹ��壨ʲôʱ��ֹͣ�����Լ���
		test02();
		}
	}
	public static void test02() {
		System.out.println("over");
		//test02();				�Լ������Լ��ͳ�Ϊ�ݹ顣������ѭ����ջ���
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
	//Ӧ���⣺�õݹ鷽������׳�
		System.out.println(factorial(10));
	
	
	}
}
