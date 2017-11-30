package Day1;

import java.util.Scanner;

public class Exam1 {
	//80점 이상 우수학점 (90~100 A학점, 80~89 B학점)
	//60점 이상 보통학점 (70~79 C학점, 60~69 D학점)
	//59점 이하 학점취득 실패  if~else문 사용
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("점수입력: ");
		int jumsu = sc.nextInt();
		
		if(jumsu>=80) {
			System.out.print("우수학점 ");
			if(jumsu>=90)System.out.println("(A)");
			else System.out.println("(B)");
		}else if(jumsu>=60) {
			System.out.print("보통학점");
			if(jumsu>=70) System.out.println("(C)");
			else System.out.println("(D)");
		}else {
			System.out.println("학점 취득 실패!");
		}
	}//main end
}//class end
