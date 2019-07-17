package mypro01;
import java.util.Scanner;		//非lang包里的类必须要做导入工作
/**
 * 测试scanner类的使用，如何接收键盘输入
 * @author Administrator
 *
 */
public class TestScanner {
	public static void test01() {
		Scanner s = new Scanner(System.in);
		//System.in表示接收键盘的输入
		String str =s.next();	//程序运行到next（）会阻塞，等待键盘输入
		System.out.println("刚才键盘输入："+str);
	}
	
	public static void test02() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个加数：");
		int a =s.nextInt();
		System.out.println("请输入另一个加数：");
		int b =s.nextInt();
		int sum=a+b;
		System.out.println("和为:"+sum);
	}
	public static void test03() {
		Scanner s = new Scanner(System.in); //定义scanner，等待输入
        System.out.println("请输入字符串："); 
        while (true) { 
                String line = s.nextLine(); //读取输入内容
                if (line.equals("exit")) break; //如果读取到exit，则退出输入
                System.out.println(">>>" + line); //打印输入内容
        } 
	}
	
	public static void main(String[] args) {
		//test02();
		test03();
	}
}
