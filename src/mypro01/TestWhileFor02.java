//���Կ��������ϰ
package mypro01;

public class TestWhileFor02 {
	public static void main(String[] urgs) {
		System.out.println("�žų˷���");
		for(int m=1;m<=9;m++) {
			for (int i=1;i<=m;i++) {	
			System.out.print(i+"*"+m+"="+(i*m)+"\t");
				if(i==m) {
				System.out.println();
				}
			}
		}	
	}
}