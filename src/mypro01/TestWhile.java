//测试while的用法
package mypro01;

public class TestWhile {
	public static void main(String[] args) {
		System.out.println("由1输出到100：");
		int a =1;						//初始化
		while(a<=100) {					//条件判断
			System.out.println(a);		//循环体
			a++;						//迭代
		}
		System.out.println("求1加到100的和");
		int b =1;
		int sum =0;
		String X = "和为:";
		while(b<=100) {
			sum += b;					//sum=sum+b
			b++;
		}
		System.out.println(X+sum);
	}
}