package day2;

public class HapEx_3 {
	//for��, while��,do~while�� �̿��� 1~10�հ�
	public static void main(String[] args) {
		int a=0, b=0, c=0;
		int hap=0, tot=0, sum=0;
		
		//HapEx1. for�� (a,hap �հ�)
			for(a=0; a<=10; a++) {
				hap=hap+a;
			}
			System.out.println("hap: "+hap);
			
		//HapEx2. while�� (b,tot �հ�)
			while(b<10) {
				b++;
				tot=tot+b;
			}
			System.out.println("tot: "+tot);
			
		//HapEx3. do~while��(c,sum �հ�)
			do {
				c++;
				sum=sum+c;
			}while(c<10);
			System.out.println("sum: "+sum);
			
	}//main end
}//class END
