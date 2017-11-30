package DAY2;

public class BreakEX2 {
	//break label이용하여 중첩for문 탈출
	public static void main(String[] args) {
		
		exit:
		for(int i=0; i<3; i++) {
			for(int j=0; j<10; j++) {
				if(j==3) break exit;
				System.out.print("[i="+i+" j="+j+"]\t");
			}
			System.out.println();
		}
		
	}//main end
}//class END
