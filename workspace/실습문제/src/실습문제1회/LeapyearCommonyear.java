package �ǽ�����1ȸ;

import java.util.Scanner;

public class LeapyearCommonyear {
	public static void main(String[] args) {
		int year;
		
		Scanner in = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� >>> ");
		year = in.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
		
	}
}
