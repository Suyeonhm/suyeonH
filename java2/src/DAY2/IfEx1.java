package DAY2;

import java.util.Scanner;

public class IfEx1 {//¦��Ȧ��
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String msg="¦��Ȧ��";
		
		System.out.print("�����Է�> ");
		int su=sc.nextInt();
		
		if(su%2==0) msg="¦��";
		else msg="Ȧ��";
		
		System.out.println(su+"�� "+msg+"�Դϴ�.");
	}//main end
}//class END
