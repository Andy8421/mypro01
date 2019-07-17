package mypro01;

public class TestSwitch {
	public static void main(String[] args) {		
				double d = Math.random();
				int e = 1+(int)(d*6); 	//掷筛子问题
				System.out.println(e);
				
				System.out.println("测试运气");
				if(e==6){
					System.out.println("运气非常好！");
				}else if(e==5){
					System.out.println("运气不错！");
				}else if(e==4) {
					System.out.println("中奖！");
				}else {
					System.out.println("谢谢惠顾！");
				}
			//注意，只有等值判断时才能用switch语句
				
				System.out.println("###############");
				switch(e){		/*返回结果为int，或者为可以自动转为int
			的类型，例如byte,short,char。JDK7.0以上还可以放置字符串*/
				case 6:
					System.out.println("运气非常好！");
					break;		/*一般case后面必须加break表示在当前结束，
			防止穿透现象*/
				case 5:
					System.out.println("运气不错！");
					break;
				case 4:
					System.out.println("中奖！");
					break;
				default:
					System.out.println("谢谢惠顾！");
					break;		//此处由于已经是最后一行代码，break可不加
				}
				
				System.out.println("字母是什么音节的？");
				char c ='a';
				int rand= (int)(26*Math.random());
				char c2= (char)(c+rand);
				System.out.print(c2+":");
				switch (c2) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':		//此例利用了case穿透现象
					System.out.println("元音");
					break;
				case 'y':
				case 'w':
					System.out.println("半元音");
					break;
				default:
					System.out.println("辅音");
					break;
				}
				
				
				
	}
}