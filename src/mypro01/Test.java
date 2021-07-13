package mypro01;

public class Test {
	public static void main(String[] args) {
		int a = 1;
		int b = a; // 将a的值赋给b；b将a的值复制了一份，两个变量相互独立
		a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);

		String s1 = "lifang";
		String s2 = s1;
		s1 = "xiaohua";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		int[] arr1 = new int[] { 5, 6, 3, 5, 48, 2 };
		int[] arr2 = arr1; // arr2和arr1指向相同的数组对象；arr2只能看做arr1的“快捷方式”
//		此处的等号表示的是传指针
		arr1[2] = 9;
		System.out.println(arr1 == arr2);
		System.out.println(arr1.equals(arr2));
		
		arr1 = null;	//arr1指向null，并不会影响arr2
//		System.out.println(arr1[2]);   空指针异常
		System.out.println(arr2[2]);
		System.out.println(arr1 == arr2);
		System.out.println(arr2.equals(arr1));

	}
}
