package mypro01;
import java.util.Scanner;		//��lang����������Ҫ�����빤��
/**
 * ����scanner���ʹ�ã���ν��ռ�������
 * @author Administrator
 *
 */
public class TestScanner {
	public static void test01() {
		Scanner s = new Scanner(System.in);
		//System.in��ʾ���ռ��̵�����
		String str =s.next();	//�������е�next�������������ȴ���������
		System.out.println("�ղż������룺"+str);
	}
	
	public static void test02() {
		Scanner s = new Scanner(System.in);
		System.out.println("������һ��������");
		int a =s.nextInt();
		System.out.println("��������һ��������");
		int b =s.nextInt();
		int sum=a+b;
		System.out.println("��Ϊ:"+sum);
	}
	public static void test03() {
		Scanner s = new Scanner(System.in); //����scanner���ȴ�����
        System.out.println("�������ַ�����"); 
        while (true) { 
                String line = s.nextLine(); //��ȡ��������
                if (line.equals("exit")) break; //�����ȡ��exit�����˳�����
                System.out.println(">>>" + line); //��ӡ��������
        } 
	}
	
	public static void main(String[] args) {
		//test02();
		test03();
	}
}
