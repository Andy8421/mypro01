//����while��for����ϰ��
package mypro01;
public class TestWhileFor {
	public static void main(String[] urgs) {
		System.out.println("1.�ֱ����100����������ż���ĺͣ�");		
		int oddSum =0;		//������������ĺ�
		int evenSum =0;		//�������ż���ĺ�
		for(int i=1;i<=100;i+=2) {
		  	oddSum += i;
	}
		System.out.println("�����ĺ�Ϊ��"+oddSum);
		for(int n=2;n<=100;n+=2) {
			evenSum +=n;
		}
		System.out.println("ż���ĺ�Ϊ��"+evenSum);
		System.out.println("#####�Ż��㷨#####");
		int oddSum2 =0;		//������������ĺ�
		int evenSum2 =0;		//�������ż���ĺ�
		for(int m=0;m<=100;m++) {
			if(m%2!=0) {	//���m��2ȡ������Ϊ0
				oddSum2 +=m;
			}else {			//���m��2ȡ����Ϊ0
				evenSum2 +=m;
			}
		}
		System.out.println("�����ĺ�Ϊ��"+oddSum2);
		System.out.println("ż���ĺ�Ϊ��"+evenSum2);
		
		System.out.println("###############");	
		
		System.out.println("2.��while��for�ֱ����1000�����ܱ�5��������,"
				+ "ÿ�����������");	
		System.out.println("��while���1000�����ܱ�5����������");
		int a =5;
		while(a<=1000) {
			System.out.print(a+"\t");
			if(a%(5*3)==0) {
		    System.out.println();
			}
		    a += 5;
		}
		
		System.out.println();    
		System.out.println("��for���1000�����ܱ�5����������");
		for(int b=1;b<=1000;b++) {
			if(b%5==0) {
				System.out.print(b+"\t");	/*����Ʊ����ÿ�����ָ�����
			Ҳ���Լӿո�Ͷ���*/
			}
			if(b%(5*3)==0) {
				System.out.println();		/*��֤ÿ���������������15ȡ
			����Ϊ0���ͻ���*/
			}
		}
		
   }
}
