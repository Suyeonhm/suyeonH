package DAY2;

public class BreakEx1 {
	//�ݺ��� Ż��(break��)
	public static void main(String[] args) {
	
		for(int i=0; i<3; i++) {
			for(int j=0; j<10; j++) {
				System.out.print("[i="+i+" j="+j+"]\t");
				if(j==3) break;
			}
			System.out.println();
		}
		    
	}//main end
}//class END
