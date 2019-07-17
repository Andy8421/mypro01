//测试for循环语句
package mypro01;
public class TestFor {
	public static void main(String[] urgs) {
		System.out.println("由1输出到100：");
		for(/*第一步*/int a= 1;/*第二步*/a<=100;/*第四步*/a++) {		
		//for循环比while循环看起来更简洁
		/*注意for循环的顺序与while是一样的，先初始化a=1,再判断a<=100，
		然后执行循环体输出结果，之后a迭代*/
			/*第三步*/System.out.println(a);
		}
	}
}
