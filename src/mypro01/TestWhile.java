//����while���÷�
package mypro01;

public class TestWhile {
	public static void main(String[] args) {
		System.out.println("��1�����100��");
		int a =1;						//��ʼ��
		while(a<=100) {					//�����ж�
			System.out.println(a);		//ѭ����
			a++;						//����
		}
		System.out.println("��1�ӵ�100�ĺ�");
		int b =1;
		int sum =0;
		String X = "��Ϊ:";
		while(b<=100) {
			sum += b;					//sum=sum+b
			b++;
		}
		System.out.println(X+sum);
	}
}