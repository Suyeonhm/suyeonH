package Day1;

import java.util.Scanner;

public class Exam1 {
	//80�� �̻� ������� (90~100 A����, 80~89 B����)
	//60�� �̻� �������� (70~79 C����, 60~69 D����)
	//59�� ���� ������� ����  if~else�� ���
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("�����Է�: ");
		int jumsu = sc.nextInt();
		
		if(jumsu>=80) {
			System.out.print("������� ");
			if(jumsu>=90)System.out.println("(A)");
			else System.out.println("(B)");
		}else if(jumsu>=60) {
			System.out.print("��������");
			if(jumsu>=70) System.out.println("(C)");
			else System.out.println("(D)");
		}else {
			System.out.println("���� ��� ����!");
		}
	}//main end
}//class end
