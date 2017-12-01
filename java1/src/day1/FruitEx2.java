package day1;

import java.util.Scanner;

public class FruitEx2 {
	//Switch를 이용하여 과일의 입력값에 따라 출력데이터 달라짐
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String res="출력데이터";
		String fruit="과일";
		
		System.out.print("과일입력> ");
		fruit=sc.nextLine();
		
		switch(fruit) {
		case "apple": res="상큼"; break;
		case "watermelon": res="달달"; break;
		case "grape": res="시원"; break;
		default: res="과일 아닌 데이터"; break;
		}
		
		System.out.println(res);
		
		
	}//main end
}//class END
