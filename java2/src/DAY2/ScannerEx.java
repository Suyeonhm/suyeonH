package DAY2;

import java.util.Scanner;

public class ScannerEx {
	// .nextInt( ); .next( ); .nextLine( );
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//������ �Է�
		//���⼭�� ����? nextInt( )�� ���ۿ� ���๮�ڰ� �־�  nextLine�� ������ ���ۿ� �ִ� ���๮�ڸ� �о� ����
			//���1.
				System.out.print("�����Է�> ");
				int age1= sc.nextInt();
				sc.nextLine();
			//���2.
				System.out.print("�����Է�> ");
				int age2= Integer.parseInt(sc.nextLine());

		//���ڿ� �Է�1
		System.out.print("�̸��Է�> ");
		String name1= sc.nextLine(); //enter�� ���� �ν�
		
		//���ڿ� �Է�2
		System.out.print("�̸��Է�> ");
		String name2= sc.next(); // ������ �ָ� ������ �и�
		
		//���
		System.out.println("����1: "+age1);
		System.out.println("����2: "+age2);
		System.out.println("�̸�1: "+name1);
		System.out.println("�̸�2: "+name2);
	}//main end
}//class END
