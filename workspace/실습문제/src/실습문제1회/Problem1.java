package �ǽ�����1ȸ;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �ڸ� �Է��ϼ���: ");
		char ch = sc.next().charAt(0);
		int diff = 'a' -'A';
		if ('a' <= ch && ch <= 'z') {
			ch -= diff;
			System.out.println(ch);
		} else if ('A' <= ch && ch <= 'Z') {
			ch += diff;
			System.out.println(ch);
		} else {
			System.out.println("�����ڰ� �ƴմϴ�.");
		}
		sc.close();
	}
}
