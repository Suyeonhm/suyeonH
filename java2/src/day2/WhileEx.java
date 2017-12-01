package day2;

public class WhileEx {
	//While 반복문 (1~10까지의 합)
	public static void main(String[] args) {
		int sum=0, su=0;
		
		while(su<10) {
			su=su+1;
			System.out.print(su+" ");
			sum=sum+su;
			System.out.println("합계: "+sum);
		}
	}//main end
}//class END
