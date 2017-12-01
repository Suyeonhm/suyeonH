package day2;

public class GugudanEx3 {
	//이중 for문 이용한 구구단 출력(가로출력, 세로출력)
	public static void main(String[] args) {
	   int i=0,j=0;
	   
		//1.가로출력
			for(i=2; i<10; i++) {
				for(j=1; j<10; j++) {
					System.out.print(i+"*"+j+"="+(i*j)+"\t");
				}
				System.out.println();
			}
			
		System.out.println();

		//2.세로출력
			for(i=1; i<10; i++) {
				for(j=2; j<10; j++) {
					System.out.print(j+"*"+i+"="+(j*i)+"\t");
				}
				System.out.println();
			}
			
	}//main end
}//class END
