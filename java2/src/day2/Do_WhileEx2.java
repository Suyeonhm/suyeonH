package day2;

public class Do_WhileEx2 {
	//DO{선처리}while(후조건) 이용하여 JAVA_DAY 5개 출력
	public static void main(String[] args) {
		int su=0;
		String name="JAVA_DAY";
		do {
			System.out.println(name);
		}while(su++<4);
	}//main end
}//class END
