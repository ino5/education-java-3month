package �ֹι�ȣ�κ�����������;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
		
		//2�ܰ� ���� => temp ���� �� �ڸ��� �ֹι�ȣ�� �ִ�. 10 or 11
		temp = 11 - (sum % 11);
		
		//3�ܰ� ���� => temp ���� �� �ڸ��� �ֹι�ȣ�� ����ؼ�...
		result = temp % 10;
		
		//�ֹι�ȣ ���� ���� üũ
		if (juminNum.charAt(juminNum.length() - 1) - '0' == result) {
			System.out.println("�Էµ� �ֹι�ȣ�� �����Դϴ�.");
			
			//"����" ����
			/*
			"����" ���� �ó����� �ۼ�
			1. ���� �ý������κ��� �⵵ ���� => 2021
			2. �ֹι�ȣ �� �ڸ��� ������Ͽ��� �⵵ �� �ڸ��� ������ => "97" => 97 ���������� ��ȯ
			3. �ֹι�ȣ �� �ڸ��� ù��° �ڸ� 1, 2, 3, 4 �� ��� ������ �� �Ǵ��Ͽ�
			   if 1, 2���� 1900�� �����ְ� => 1900 + 97 = 1997
			      3, 4���� 2000�� �����ش�.
			4. 2021 - 1997 = ���� ����
			*/
			Calendar calendar = Calendar.getInstance(Locale.KOREA);
			int currentYear = calendar.get(Calendar.YEAR);
			int yy = Integer.parseInt(juminNum.substring(0, 2));
			if (juminNum.charAt(7) - '0' < 3) {
				yy += 1900;
			} else {
				yy += 2000;
			}
			int age = currentYear - yy + 1;
			System.out.println("����: " + age);
			
			// "����" ����
			if((juminNum.charAt(7) - '0') % 2 == 0) {
				System.out.println("����: ����");
			} else {
				System.out.println("����: ����");
			}
			
			// "����" ����
			String[][] localCode = {
					{"����","00","08"}, {"�λ�","09","12"},
					{"��õ","13","15"}, {"���","16","25"},
					{"����","26","34"}, {"���","35","39"},
					{"����","40","40"}, {"�泲","41","43"},
					{"�泲","45","47"}, {"����","44","44"},
					{"����","96","96"}, {"����","48","54"},
					{"����","55","64"}, {"����","65","66"},
					{"�뱸","67","70"}, {"���","71","80"},
					{"�泲","81","84"}, {"�泲","86","90"},
					{"���","85","85"}, {"����","91","95"}
			};
			String localeString = juminNum.substring(8, 10);
			int locale = Integer.parseInt(localeString);
			String birthPlace = null;
			
			for (int j = 0; j <= 19; j++) {
				if (locale >= Integer.parseInt(localCode[j][1]) &&
					locale <= Integer.parseInt(localCode[j][2])) {
					birthPlace = localCode[j][0];
				}
			}
			System.out.println("�������: " + birthPlace);
			
//			������ ��
//			int placeNum = Integer.parseInt(juminNum.substring(8, 10));	
//			for (int i = 0; i < localCode.length; i++) {
//				int min = Integer.parseInt(localCode[i][1]);
//				int max = Integer.parseInt(localCode[i][2]);
//				if (placeNum >= min && placeNum <= max) {
//					System.out.println("����: " + localCode[i][0]);
//					break;
//				}
//			}
			
			// "�������" ����
			System.out.println("�������: " + yy + "/" + juminNum.substring(2, 4) + "/" + juminNum.substring(4, 6));
			
			// "��" ����
			String ddi = null;
			String[] gangi = {"������", "��", "��", "����", "��", "��", "��", "�䳢", "��", "��", "��", "��"};
			ddi = gangi[yy % 12];
			System.out.println("��: " + ddi);
		} else {
			System.out.println("�Էµ� �ֹι�ȣ�� Ʋ�� ��ȣ�Դϴ�.");
		}
	}
}
