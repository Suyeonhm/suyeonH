package Day1;

import java.util.Scanner;

public class Exam3 {
	//국어 영어 수학 입력 받고 , 평균으로 학점 계산
	//90~100: A학점, 80~89 :B학점, 70~79 :C학점 , 60~69 :D학점, 59점이하 : F학점
	//switch문 사용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, hap;
		double avg;
		char grade='F';

		System.out.print("국어입력 > ");
		kor=sc.nextInt();
		System.out.print("영어입력> ");
		eng=sc.nextInt();
		System.out.print("수학입력> ");
		math=sc.nextInt();
		
		hap=kor+eng+math;
		avg=(double)hap/3;
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F'; break; //마지막 break 생략가능
		}//switch end
		
		System.out.println("학점> "+grade);
	}//main end
}//class end
