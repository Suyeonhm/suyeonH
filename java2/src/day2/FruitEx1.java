package day2;

import java.util.Scanner;

public class FruitEx1 {
	//if~else를 이용하여 과일의 입력값에 따라 출력데이터 달라짐
	//문자열 비교 변수명.equals(" ");
	//문자열 입력 - .nextLine( );
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String res="출력데이터";
		String fruit = "과일";
		
		System.out.print("과일입력> ");
		fruit=sc.nextLine();
		
		if(fruit.equals("apple")) {
			res="상큼";
		}else if(fruit.equals("watermelon")) {
			res="달달";
		}else if(fruit.equals("grape")) {
			res="시원";
		}else {res="과일 아닌 데이터";}
	
		System.out.println(res);
		
	}//main end
}//class END
