package ��Ʈ�����뿹��;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * ȸ��(Member) ��ü���� '����' ȸ���� ��� ���̸� ���ٽİ� ��Ʈ����
 * �����Ͽ� ���α׷� �ۼ�
 */

public class StreamPipelinesEx {
	public static void main(String[] args) {
		List<Member> list = (List) Arrays.asList(new Member("����ȣ", Member.MALE, 30),
												 new Member("�迬��", Member.FEMALE, 29),
												 new Member("������", Member.MALE, 32),
												 new Member("������", Member.MALE, 27));
		
		// [��� 1] �ܺ� �ݺ��ڸ� �����Ͽ� �ذ�
		// index�� �̿��ϴ� for�� �׸��� Iterator�� �̿��ϴ� while���� ���
		// �ܺ� �ݺ��ڸ� �̿��Ѵ�.
		
		int count = 0;
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getGender() == Member.MALE) {
				sum += list.get(i).getAge();
				count++;
			}
		}
		double ageAvg = sum/count;
		
		System.out.println("���� ȸ���� ��� ����: " + ageAvg); 
		
		// [��� 2] ���� �ݺ��ڸ� �����Ͽ� �ذ�
		double ageAvg2 = list.stream() 									// �������� ��Ʈ��
//							 .filter(x -> x.getGender() == Member.MALE) // �߰� ó�� ��Ʈ��
//						     .mapToInt(Member::getAge) 					// �߰� ó�� ��Ʈ��
						     .mapToInt(x -> x.getAge())
						     .average()									// ���� ó�� ��Ʈ��
						     .getAsDouble();
						
		System.out.println("���� ȸ���� ��� ����: " + Math.floor(ageAvg2)); 
	}
}
