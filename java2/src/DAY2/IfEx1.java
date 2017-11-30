package DAY2;

import java.util.Scanner;

public class IfEx1 {//Â¦¼öÈ¦¼ö
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String msg="Â¦¼öÈ¦¼ö";
		
		System.out.print("¼ýÀÚÀÔ·Â> ");
		int su=sc.nextInt();
		
		if(su%2==0) msg="Â¦¼ö";
		else msg="È¦¼ö";
		
		System.out.println(su+"Àº "+msg+"ÀÔ´Ï´Ù.");
	}//main end
}//class END
