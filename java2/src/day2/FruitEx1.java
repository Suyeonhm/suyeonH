package day2;

import java.util.Scanner;

public class FruitEx1 {
	//if~else�� �̿��Ͽ� ������ �Է°��� ���� ��µ����� �޶���
	//���ڿ� �� ������.equals(" ");
	//���ڿ� �Է� - .nextLine( );
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String res="��µ�����";
		String fruit = "����";
		
		System.out.print("�����Է�> ");
		fruit=sc.nextLine();
		
		if(fruit.equals("apple")) {
			res="��ŭ";
		}else if(fruit.equals("watermelon")) {
			res="�޴�";
		}else if(fruit.equals("grape")) {
			res="�ÿ�";
		}else {res="���� �ƴ� ������";}
	
		System.out.println(res);
		
	}//main end
}//class END
