package mypro01;

public class TestSwitch {
	public static void main(String[] args) {		
				double d = Math.random();
				int e = 1+(int)(d*6); 	//��ɸ������
				System.out.println(e);
				
				System.out.println("��������");
				if(e==6){
					System.out.println("�����ǳ��ã�");
				}else if(e==5){
					System.out.println("��������");
				}else if(e==4) {
					System.out.println("�н���");
				}else {
					System.out.println("лл�ݹˣ�");
				}
			//ע�⣬ֻ�е�ֵ�ж�ʱ������switch���
				
				System.out.println("###############");
				switch(e){		/*���ؽ��Ϊint������Ϊ�����Զ�תΪint
			�����ͣ�����byte,short,char��JDK7.0���ϻ����Է����ַ���*/
				case 6:
					System.out.println("�����ǳ��ã�");
					break;		/*һ��case��������break��ʾ�ڵ�ǰ������
			��ֹ��͸����*/
				case 5:
					System.out.println("��������");
					break;
				case 4:
					System.out.println("�н���");
					break;
				default:
					System.out.println("лл�ݹˣ�");
					break;		//�˴������Ѿ������һ�д��룬break�ɲ���
				}
				
				System.out.println("��ĸ��ʲô���ڵģ�");
				char c ='a';
				int rand= (int)(26*Math.random());
				char c2= (char)(c+rand);
				System.out.print(c2+":");
				switch (c2) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':		//����������case��͸����
					System.out.println("Ԫ��");
					break;
				case 'y':
				case 'w':
					System.out.println("��Ԫ��");
					break;
				default:
					System.out.println("����");
					break;
				}
				
				
				
	}
}