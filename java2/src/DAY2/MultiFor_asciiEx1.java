package DAY2;

public class MultiFor_asciiEx1 {
	//이중for문 이용 - A~O 출력
	public static void main(String[] args) {
		char ch=65; //ascii코드 char ch='A';
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
		
	}//main end
}//class END
