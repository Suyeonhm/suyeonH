package day2;

public class HapEx_3 {
	//for문, while문,do~while문 이용한 1~10합계
	public static void main(String[] args) {
		int a=0, b=0, c=0;
		int hap=0, tot=0, sum=0;
		
		//HapEx1. for문 (a,hap 합계)
			for(a=0; a<=10; a++) {
				hap=hap+a;
			}
			System.out.println("hap: "+hap);
			
		//HapEx2. while문 (b,tot 합계)
			while(b<10) {
				b++;
				tot=tot+b;
			}
			System.out.println("tot: "+tot);
			
		//HapEx3. do~while문(c,sum 합계)
			do {
				c++;
				sum=sum+c;
			}while(c<10);
			System.out.println("sum: "+sum);
			
	}//main end
}//class END
