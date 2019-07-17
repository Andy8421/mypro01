package mypro01;

/**
 * 练习题（这几道题花的时间比较多，要多加练习）
 * @author 易畅
 *
 */
public class Exercises {
	/**
	 * 练习题1.求∑1+∑2+……+∑100的值
	 * @param a
	 */
	public static void test01(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			for(int m=1;m<=i;m++) {
				sum+=m;
			}
		}
	System.out.println("练习题1的计算结果是："+sum);
	}
	
	/**
	 * 练习题2.求1!+2!+……+100!的值
	 * @param a
	 */
	public static void test02(double a) {
		double sum=0;
		for(double i=1;i<=a;i++) {
			double product=1;
			for(double m=1;m<=i;m++) {
				product*=m;
			}
		sum+=product;
		}
	System.out.println("练习题2的计算结果是："+sum);
	}

	/**
	 * 练习题3.求1~1000以内的所有质数，每行写6个
	 * @param a
	 */
	public static void test03(int p) {
		System.out.println("练习题3的结果如下：");
		int count=0;				//计数器
		outer:for(int i=2;i<p;i++) {
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					continue outer;
				}
			}
			System.out.print(i+"\t");
			count++;
			if(count%6==0) {		//累计产生6个数就换行
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		test01(100);
		test02(100);
		test03(1000);
	}
}
