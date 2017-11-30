package DAY2;

import java.util.Scanner;

public class ScannerEx {
	// .nextInt( ); .next( ); .nextLine( );
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//정수형 입력
		//여기서의 문제? nextInt( )의 버퍼에 개행문자가 있어  nextLine을 만나면 버퍼에 있는 개행문자를 읽어 들임
			//방법1.
				System.out.print("나이입력> ");
				int age1= sc.nextInt();
				sc.nextLine();
			//방법2.
				System.out.print("나이입력> ");
				int age2= Integer.parseInt(sc.nextLine());

		//문자열 입력1
		System.out.print("이름입력> ");
		String name1= sc.nextLine(); //enter앞 까지 인식
		
		//문자열 입력2
		System.out.print("이름입력> ");
		String name2= sc.next(); // 공백을 주면 데이터 분리
		
		//결과
		System.out.println("나이1: "+age1);
		System.out.println("나이2: "+age2);
		System.out.println("이름1: "+name1);
		System.out.println("이름2: "+name2);
	}//main end
}//class END
