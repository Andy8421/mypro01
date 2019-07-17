//测试JDK7以上的新特性,表达式结果可以是字符串
package mypro01;
public class TestSwitch02 {
	public static void main(String[] args) {
	String a = "易畅";
	switch (a) {
	case "甲":
		System.out.println("输入的是甲");
		break;
	case "易畅":
		System.out.println("输入的是易畅");
		break;
	default:
		System.out.print("Merry Christmas!");
		break;
	}
			
   }
}