package day1;

import java.util.Scanner;

public class FruitEx2 {
	//Switch�� �̿��Ͽ� ������ �Է°��� ���� ��µ����� �޶���
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String res="��µ�����";
		String fruit="����";
		
		System.out.print("�����Է�> ");
		fruit=sc.nextLine();
		
		switch(fruit) {
		case "apple": res="��ŭ"; break;
		case "watermelon": res="�޴�"; break;
		case "grape": res="�ÿ�"; break;
		default: res="���� �ƴ� ������"; break;
		}
		
		System.out.println(res);
		
		
	}//main end
}//class END
