package DAY2;

import java.util.Scanner;

public class GugudanEX2 {
	//dan�Է� �޾� dan*5���� ���
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dan;
		
		System.out.print("���Է�> ");
		dan=sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			if(i==5) break;
		}
		
		sc.close();
	}//main end
}//class END
