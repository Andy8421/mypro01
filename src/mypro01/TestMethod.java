
//测试方法
package mypro01;

public class TestMethod {
	public static int add(int a,int b) {	/*定义一个方法add（），
	 此处，a和b称为形参*/
		int sum=a+b;
		if(a==3) {
			return 0;
		}
		System.out.println("恭喜！由于第一个字母是3，只能出现0给您。");
		return sum;							/*有return语句时，必须要有
	返回值，因此定义的方法不可能出现void。return语句的作用是：1.获得返回值；2.结束方法的运行
	其后即使还有方法也不在运行了（JDK8.0以上的版本没有第二条限制）*/
	}

	public static void test01(int a){  			//定义方法01
		int oddSum2 =0;						//用来存放奇数的和
		int evenSum2 =0;					//用来存放偶数的和
		for(int m=0;m<=a;m++) {
			if(m%2!=0) {					//如果m对2取余数不为0
				oddSum2 +=m;
			}else {							//如果m对2取余数为0
				evenSum2 +=m;
			}
		}
		System.out.println("奇数的和为："+oddSum2);
		System.out.println("偶数的和为："+evenSum2);
	}
	
	
	
	public static void test02(int c,int d,int e) {			/*定义方法02，void表示该方法
	         只是做数据处理，没有返回值*/
		for(int b=1;b<=c;b++) {
			if(b%d==0) {
				System.out.print(b+"\t");	/*后加制表符将每行数字隔开，
			也可以加空格和逗号*/
			}
			if(b%(d*e)==0) {
				System.out.println();		/*保证每行e个就是,如果对(d*e)
				取余数为0，就换行*/
			}
		}
	}
	public static void main(String[] args) {
		test01(1000);						//直接调用方法，求1+……+1000的和
		test02(100,3,5);					/*求1~100中能被3整除的所有数
		每行写5个*/
		System.out.println();
		int s=add(3,5);						/*调用自定义的方法，此处3和
	5称为实参*/
		int t=add(5,3);
		System.out.println(s);
		System.out.println(t);
		
	/*设计方法的原则：方法的本意是功能块，就是实现某个语句块的集合，我们设计方法的时候，最好保留方法的
	 原子性，一个方法只完成一个功能，这样有利于后期工作扩展*/
	}
}
