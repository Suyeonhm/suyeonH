package day2;

public class WhileEx {
	//While �ݺ��� (1~10������ ��)
	public static void main(String[] args) {
		int sum=0, su=0;
		
		while(su<10) {
			su=su+1;
			System.out.print(su+" ");
			sum=sum+su;
			System.out.println("�հ�: "+sum);
		}
	}//main end
}//class END
