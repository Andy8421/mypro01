
//���Է���
package mypro01;

public class TestMethod {
	public static int add(int a,int b) {	/*����һ������add������
	 �˴���a��b��Ϊ�β�*/
		int sum=a+b;
		if(a==3) {
			return 0;
		}
		System.out.println("��ϲ�����ڵ�һ����ĸ��3��ֻ�ܳ���0������");
		return sum;							/*��return���ʱ������Ҫ��
	����ֵ����˶���ķ��������ܳ���void��return���������ǣ�1.��÷���ֵ��2.��������������
	���ʹ���з���Ҳ���������ˣ�JDK8.0���ϵİ汾û�еڶ������ƣ�*/
	}

	public static void test01(int a){  			//���巽��01
		int oddSum2 =0;						//������������ĺ�
		int evenSum2 =0;					//�������ż���ĺ�
		for(int m=0;m<=a;m++) {
			if(m%2!=0) {					//���m��2ȡ������Ϊ0
				oddSum2 +=m;
			}else {							//���m��2ȡ����Ϊ0
				evenSum2 +=m;
			}
		}
		System.out.println("�����ĺ�Ϊ��"+oddSum2);
		System.out.println("ż���ĺ�Ϊ��"+evenSum2);
	}
	
	
	
	public static void test02(int c,int d,int e) {			/*���巽��02��void��ʾ�÷���
	         ֻ�������ݴ���û�з���ֵ*/
		for(int b=1;b<=c;b++) {
			if(b%d==0) {
				System.out.print(b+"\t");	/*����Ʊ����ÿ�����ָ�����
			Ҳ���Լӿո�Ͷ���*/
			}
			if(b%(d*e)==0) {
				System.out.println();		/*��֤ÿ��e������,�����(d*e)
				ȡ����Ϊ0���ͻ���*/
			}
		}
	}
	public static void main(String[] args) {
		test01(1000);						//ֱ�ӵ��÷�������1+����+1000�ĺ�
		test02(100,3,5);					/*��1~100���ܱ�3������������
		ÿ��д5��*/
		System.out.println();
		int s=add(3,5);						/*�����Զ���ķ������˴�3��
	5��Ϊʵ��*/
		int t=add(5,3);
		System.out.println(s);
		System.out.println(t);
		
	/*��Ʒ�����ԭ�򣺷����ı����ǹ��ܿ飬����ʵ��ĳ������ļ��ϣ�������Ʒ�����ʱ����ñ���������
	 ԭ���ԣ�һ������ֻ���һ�����ܣ����������ں��ڹ�����չ*/
	}
}
