package DAY2;

public class MultiFor_asciiEx1 {
	//����for�� �̿� - A~O ���
	public static void main(String[] args) {
		char ch=65; //ascii�ڵ� char ch='A';
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
		
	}//main end
}//class END
