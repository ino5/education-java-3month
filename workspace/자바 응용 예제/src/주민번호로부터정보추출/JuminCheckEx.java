package �ֹι�ȣ�κ�����������;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheckEx {
	public static void main(String[] args) {
		//�غ� �ܰ�: �ʿ� ����, �迭�� �ʱ�ȭ
		String juminNum;
		int sum = 0; //���� ������ 0���� �ʱ�ȭ
		int[] weight = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; // ����ġ �迭 �ʱ�ȭ 
		int temp, result;
		
		//�Է� �ܰ�
		System.out.print("�ֹι�ȣ �Է� >>> ");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.nextLine(); // ���ڿ��� �Է� ���� => '-; �����Ͽ� �Է¿�!!
		/*
		 * �Է� ���� �ֹι�ȣ�� ��ȿ�� �˻� => ���� ǥ����(regex) ���� ����
		 */
		String regex = "^[0-9]{6}-[1234][0-9]{6}$";
		
		//[ù��° ���]
		//boolean check = Pattern.matches(regex, juminNum);
		
		//[�ι�° ���]
		boolean check = juminNum.matches(regex);
		
		if (check == false) {
			System.out.println("�Էµ� �ֹι�ȣ�� ���� ǥ���Ŀ� ���Ŀ� ���� ����!");
			return;
		}
		System.out.println("�Էµ� �ֹι�ȣ�� ���� ǥ���Ŀ� ���Ŀ� ������!");
		
		/*
		 * �Է¹��� �ֹι�ȣ�� üũ ���� ����
		 */
		//1�ܰ� ���� => sum ���ϱ�
		for (int i = 0; i < juminNum.length() - 1; i++) {
			sum += weight[i] * (juminNum.charAt(i) - '0');
		}
		
		temp = 11 - (sum % 11);
		result = temp % 10;
		if (juminNum.charAt(juminNum.length() - 1) - '0' == result) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
