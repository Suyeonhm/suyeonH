package Day1;

import java.util.Scanner;

public class Exam2 {
	//국어, 영어, 수학 입력받아 평균 70점 이상 합격, 이하 불합격(2)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, hap; 
		double avg;
		String msg;
		
		System.out.print("국어 입력 > ");
		kor=sc.nextInt(); 
		System.out.print("영어입력 > ");
		eng=sc.nextInt(); 
		System.out.print("수학입력 > ");
		math=sc.nextInt();
		
		hap=kor+eng+math;
		avg=(double)hap/3.0;
		
		//첫번째(if~else)
		if(avg>=70) {
			msg="합격"; System.out.println("결과1 > "+msg);
		}else {
			msg="불합격"; System.out.println("결과1 > "+msg);
		}
		
		//두번째(삼항연산자)
		msg = (avg>=70) ? "합격" : "불합격";
		System.out.println("결과2 > "+msg);
		
	}//main end
}//class end
