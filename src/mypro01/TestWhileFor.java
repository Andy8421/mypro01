//测试while和for的练习题
package mypro01;
public class TestWhileFor {
	public static void main(String[] urgs) {
		System.out.println("1.分别计算100以内奇数和偶数的和：");		
		int oddSum =0;		//用来存放奇数的和
		int evenSum =0;		//用来存放偶数的和
		for(int i=1;i<=100;i+=2) {
		  	oddSum += i;
	}
		System.out.println("奇数的和为："+oddSum);
		for(int n=2;n<=100;n+=2) {
			evenSum +=n;
		}
		System.out.println("偶数的和为："+evenSum);
		System.out.println("#####优化算法#####");
		int oddSum2 =0;		//用来存放奇数的和
		int evenSum2 =0;		//用来存放偶数的和
		for(int m=0;m<=100;m++) {
			if(m%2!=0) {	//如果m对2取余数不为0
				oddSum2 +=m;
			}else {			//如果m对2取余数为0
				evenSum2 +=m;
			}
		}
		System.out.println("奇数的和为："+oddSum2);
		System.out.println("偶数的和为："+evenSum2);
		
		System.out.println("###############");	
		
		System.out.println("2.用while和for分别输出1000以内能被5整除的数,"
				+ "每行输出三个：");	
		System.out.println("用while输出1000以内能被5整除的数：");
		int a =5;
		while(a<=1000) {
			System.out.print(a+"\t");
			if(a%(5*3)==0) {
		    System.out.println();
			}
		    a += 5;
		}
		
		System.out.println();    
		System.out.println("用for输出1000以内能被5整除的数：");
		for(int b=1;b<=1000;b++) {
			if(b%5==0) {
				System.out.print(b+"\t");	/*后加制表符将每行数字隔开，
			也可以加空格和逗号*/
			}
			if(b%(5*3)==0) {
				System.out.println();		/*保证每行三个就是如果对15取
			余数为0，就换行*/
			}
		}
		
   }
}
