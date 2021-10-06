package Enum����ǽ�;

import java.util.Scanner;

public class PayGropTest {
	private static final Object EMPTY = null;
	
	public static void main(String[] args) {
		for (PayGrop type : PayGrop.values()) {
			System.out.print("���� ����: ");
			System.out.println(type.getTitle());
		}
		System.out.println();
		
		for (PayGrop type : PayGrop.values()) {
			System.out.println(type.getPayList());
		}
		System.out.println();
		
		System.out.print("���� ������ �Է��ϼ��� >>> ");
		Scanner in = new Scanner(System.in);
		String payment_means = in.next();
		
		PayGrop pay = PayGrop.findByPayCode(payment_means);
		
		if (pay.equals(EMPTY)) {
			System.out.println("���� ����: " + pay.getTitle());
		} else {
			System.out.println("���� ����: " + pay.getTitle());
		}
	}
}
