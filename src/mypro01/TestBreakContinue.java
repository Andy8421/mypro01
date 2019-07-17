//测试break和continue
//break是终止全部循环，而continue是终止档次循环
package mypro01;

public class TestBreakContinue {
	public static void main(String[] args) {
		System.out.println("多少次才能抽中88？");
		int total=0;
		System.out.println("Begign");
		while(true) {	//死循环
			total++;
			int i= (int)Math.round(100*Math.random());
			//round（）是对结果四舍五入，random（）是产生（0，1）的随机数
			if(i==88)
			break;		//意为碰到88，就停止整个循环
		}
		System.out.println("Game over,used"+total+"times.");
		
		System.out.println("#######################");
		System.out.println("把100~150之间不能被3整除的数输出：");
		for(int m=100;m<150;m++) {
			if(m%3!=0) {
				System.out.print(m+"\t");
			}
		}
		System.out.println();
		System.out.println("########用continue语句#######");
		for(int n=100;n<150;n++) {
			if(n%3==0) {
				continue;	//如果条件满足，结束本次循环，直接进行下一次循环
			}
			System.out.print(n+"\t");
		}
	}
}
