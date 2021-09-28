package List�迭��Ŭ�����鿹��;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClassEx {
	public static void main(String[] args) {
		String[] name = {"������", "����ȣ", "������", "�����", "�ڰ渮"};
		
		// Vector ��ü ����
		// List<E> list = new Vector<E>(); //�Ϲ����� ���
		List<String> list = new Vector<String>(4, 3);
		
		// Vector Ŭ������ �ֿ� �޼ҵ� ����
		System.out.println("���Ϳ� ����� ����� ����: " + list.size());  // 0�� ��µ�!
		System.out.println("������ �뷮��: " + ((Vector<String>) list).capacity()); // 4
		
		/* ��ü �߰� */
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]); // ��ü �߰�
		}

		System.out.println("���Ϳ� ����� ����� ����: " + list.size());  // 0�� ��µ�!
		System.out.println("������ �뷮��: " + ((Vector<String>) list).capacity()); // 4
		
		System.out.println(list);
		
		list.add(2, "������");
		System.out.println(list);
		
		/* ��ü �˻� get() �޼ҵ�, contains(), size() */
		System.out.println(list.get(1));
		
		boolean contains_result = list.contains("�����");
		System.out.println(contains_result);

		boolean contains_result2 = list.contains("ȫ�浿");
		System.out.println(contains_result2);
		
		System.out.println(list.size());
		
		/* ��ü ���� set() �޼ҵ� */
		// "������" ��ü�� "�̹���" ��ü�� �����ϰ��� �Ѵ�.
		list.set(2, "�̹���");
		System.out.println(list);
		
		/* ��ü ���� remove() �޼ҵ� */
		list.remove(3);
		System.out.println(list);
		
		list.remove("�����");
		System.out.println(list);
		
		System.out.println(); //����
		
		/* ��ü ���� => �������� */
		System.out.println("[��ü �������� ����]");
		Collections.sort(list);
		System.out.println(list);
		
		/* ��ü ���� => �������� */
		System.out.println("[��ü �������� ����]");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
