

package mypro01;

public class TestIf {
	public static void main(String[] args) {
		//����if���		
		double d = Math.random();
		int e = (int)(d*5); 	//ǿ�н�ֵ���Ϊ[0,4]����������
		System.out.println(d);
		System.out.println(e);
		
		if(e>=2&&e<=3){				/*if�������û��{}��������������ʱ��
		ֻ��ִ�е�һ�䡣ע�⣬�˴�����д2<=e<=3*/
			System.out.println("�ڷ�Χ��");
		}else {
			System.out.println("δ���ڷ�Χ��");
		}
		
		//���Զ�ѡ��ṹ
		System.out.println("��������");
		if(e==3){
			System.out.println("�����ǳ��ã�");
		}else if(e==4){
			System.out.println("��������");
		}else if(e==2) {
			System.out.println("�н���");
		}else {
			System.out.println("лл�ݹˣ�");
		}
		
//��ѡ��ṹ��ʱ������Switch������ 		
	}
}
