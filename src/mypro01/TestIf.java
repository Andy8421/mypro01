

package mypro01;

public class TestIf {
	public static void main(String[] args) {
		//测试if语句		
		double d = Math.random();
		int e = (int)(d*5); 	//强行将值输出为[0,4]的整数类型
		System.out.println(d);
		System.out.println(e);
		
		if(e>=2&&e<=3){				
			System.out.println("在范围内");
		}else {
			System.out.println("未落在范围内");
		}
		
		//测试多选择结构
		System.out.println("测试运气");
		if(e==3){
			System.out.println("运气非常好！");
		}else if(e==4){
			System.out.println("运气不错！");
		}else if(e==2) {
			System.out.println("中奖！");
		}else {
			System.out.println("谢谢惠顾！");
		}
		
//多选则结构有时可以用Switch语句代替 		
	}
}
