package �ǽ�����1ȸ;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>> ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		
		sc.close();
	}
}
