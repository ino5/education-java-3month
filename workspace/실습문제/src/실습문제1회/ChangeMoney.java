package �ǽ�����1ȸ;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int[] arrMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String[] str = {"��������", "������", "��õ����", "õ����", "�����", "���", "���ʿ�", "�ʿ�", "�Ͽ�"};
		int[] result = new int[9];
		
		System.out.println("�ݾ��� �Է��ϼ��� >>> ");
		Scanner in = new Scanner(System.in);
		int Money = in.nextInt(); // �Է¹��� ���ڿ��� ������ ��ȯ�Ͽ� �Է�
		
		// ó���� ����� �ѹ��� ó������!
		for (int i = 0; i < arrMoney.length; i++) {
			int num = Money / arrMoney[i]; // ��
			int remainder = Money % arrMoney[i]; // ������
			Money = remainder;
			
			if (num > 0 && i < 4) {
				System.out.println(str[i] + " " + num + "��");
			} else if (num > 0 && i >= 4) {
				System.out.println(str[i] + " " + num + "��");
			}
		}
	}
}
