package Day1;

import java.util.Scanner;

public class Exam2 {
	//����, ����, ���� �Է¹޾� ��� 70�� �̻� �հ�, ���� ���հ�(2)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, hap; 
		double avg;
		String msg;
		
		System.out.print("���� �Է� > ");
		kor=sc.nextInt(); 
		System.out.print("�����Է� > ");
		eng=sc.nextInt(); 
		System.out.print("�����Է� > ");
		math=sc.nextInt();
		
		hap=kor+eng+math;
		avg=(double)hap/3.0;
		
		//ù��°(if~else)
		if(avg>=70) {
			msg="�հ�"; System.out.println("���1 > "+msg);
		}else {
			msg="���հ�"; System.out.println("���1 > "+msg);
		}
		
		//�ι�°(���׿�����)
		msg = (avg>=70) ? "�հ�" : "���հ�";
		System.out.println("���2 > "+msg);
		
	}//main end
}//class end
