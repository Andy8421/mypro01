//����break��continue
//break����ֹȫ��ѭ������continue����ֹ����ѭ��
package mypro01;

public class TestBreakContinue {
	public static void main(String[] args) {
		System.out.println("���ٴβ��ܳ���88��");
		int total=0;
		System.out.println("Begign");
		while(true) {	//��ѭ��
			total++;
			int i= (int)Math.round(100*Math.random());
			//round�����ǶԽ���������룬random�����ǲ�����0��1���������
			if(i==88)
			break;		//��Ϊ����88����ֹͣ����ѭ��
		}
		System.out.println("Game over,used"+total+"times.");
		
		System.out.println("#######################");
		System.out.println("��100~150֮�䲻�ܱ�3�������������");
		for(int m=100;m<150;m++) {
			if(m%3!=0) {
				System.out.print(m+"\t");
			}
		}
		System.out.println();
		System.out.println("########��continue���#######");
		for(int n=100;n<150;n++) {
			if(n%3==0) {
				continue;	//����������㣬��������ѭ����ֱ�ӽ�����һ��ѭ��
			}
			System.out.print(n+"\t");
		}
	}
}
