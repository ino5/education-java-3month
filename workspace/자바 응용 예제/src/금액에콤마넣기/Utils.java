package �ݾ׿��޸��ֱ�;

import java.text.DecimalFormat;

public class Utils {
	/*
	 * �Է� ���� �ݾ׿� õ ���� ���� �޸� �ֱ� �Լ� ����
	 */
	public static String toNumberFormat(long totalAmount) {
		
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(totalAmount);
	}
}
