package ������ó���ǽ�;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	public static void main(String[] args) {
		String str = "�������� ���� �ܰ�� �����м��̴�. ���� �����м��� Ű���带 �����ϴ� ����� ��Ƴ��´�.";
		
		Pattern p = Pattern.compile("�����м�");
		Matcher m = p.matcher(str);
		
		int count = 0;
		String word = null;
		
		while (m.find()) { // find()�� ������ ��ġ�ϸ� true, ��ġ���� ������ false
			word = m.group(); // group()�� ��� �ؽ�Ʈ ��ü���� ���ϰ� ��ġ�� �ؽ�Ʈ�� ��ȯ
			count++;
//			System.out.println(m.start());
//			System.out.println(m.end());
		}
		System.out.println("�м����: " + "������ġ");
		System.out.println(word + " �ܾ�=> " + count + "��");
		
	}
}
