package mypro01;

/**
 * ��ϰ�⣨�⼸���⻨��ʱ��Ƚ϶࣬Ҫ�����ϰ��
 * @author �׳�
 *
 */
public class Exercises {
	/**
	 * ��ϰ��1.���1+��2+����+��100��ֵ
	 * @param a
	 */
	public static void test01(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			for(int m=1;m<=i;m++) {
				sum+=m;
			}
		}
	System.out.println("��ϰ��1�ļ������ǣ�"+sum);
	}
	
	/**
	 * ��ϰ��2.��1!+2!+����+100!��ֵ
	 * @param a
	 */
	public static void test02(double a) {
		double sum=0;
		for(double i=1;i<=a;i++) {
			double product=1;
			for(double m=1;m<=i;m++) {
				product*=m;
			}
		sum+=product;
		}
	System.out.println("��ϰ��2�ļ������ǣ�"+sum);
	}

	/**
	 * ��ϰ��3.��1~1000���ڵ�����������ÿ��д6��
	 * @param a
	 */
	public static void test03(int p) {
		System.out.println("��ϰ��3�Ľ�����£�");
		int count=0;				//������
		outer:for(int i=2;i<p;i++) {
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					continue outer;
				}
			}
			System.out.print(i+"\t");
			count++;
			if(count%6==0) {		//�ۼƲ���6�����ͻ���
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		test01(100);
		test02(100);
		test03(1000);
	}
}
