package Day1;

import java.util.Scanner;

public class Exam3 {
	//���� ���� ���� �Է� �ް� , ������� ���� ���
	//90~100: A����, 80~89 :B����, 70~79 :C���� , 60~69 :D����, 59������ : F����
	//switch�� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, hap;
		double avg;
		char grade='F';

		System.out.print("�����Է� > ");
		kor=sc.nextInt();
		System.out.print("�����Է�> ");
		eng=sc.nextInt();
		System.out.print("�����Է�> ");
		math=sc.nextInt();
		
		hap=kor+eng+math;
		avg=(double)hap/3;
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F'; break; //������ break ��������
		}//switch end
		
		System.out.println("����> "+grade);
	}//main end
}//class end
