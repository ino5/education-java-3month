package �ǽ�����1ȸ;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		String[] names = {"��������", "������", "��õ����", "õ����", "�����", "���", "���ʿ�", "�ʿ�"};
		int[] prices = {50000, 10000, 5000, 1000, 500, 100, 50, 10};		

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��� �ּ���: ");
		int money = sc.nextInt();
		int[] cnts = new int[names.length];

		for (int i = 0; i < cnts.length; i++) {
			while (money >= prices[i]) {
				money -= prices[i];
				cnts[i]++;
			}
		}
		
		for (int i = 0; i < cnts.length; i++) {
			if (cnts[i] > 0) {
				if (prices[i] >= 1000) {
					System.out.println(names[i] + " " + cnts[i] + "��");
				} else {
					System.out.println(names[i] + " " + cnts[i] + "��");
				}
			}
		}
		
		sc.close();
	}
}
