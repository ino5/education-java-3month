package List�迭��Ŭ�����鿹��;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Vector, ArrayList Ŭ������
 * ��� '����' �迭(��, ���� �迭) Ŭ�����̴�.
 * ���� �迭�� ������ �ִ� �������� �ذ��ϱ� ���ؼ�
 * ������� Ŭ�������̴�.
 * <������>
 * Vector�� ����ȭ�� ���������, ArrayList�� ����ȭ���� �ʴ´�.
 * 
 */

public class ArrayListClassEx {
	public static void main(String[] args) {
		//ArrayList ��ü ����
		//List<E> list = new ArrayList<E>();
		List<Integer> list = new ArrayList<Integer>();
		 
		/* ��ü �߰� */
		list.add(new Integer(90)); // ���� 90�� ��üȭ ��Ŵ! list.add(90); ���� => �ڵ� �ڽ�
		list.add(new Integer(85));
		list.add(new Integer(100));
		list.add(new Integer(70));
		list.add(new Integer(75));
		
		System.out.println(list);
		
		list.add(2, 60);
		System.out.println(list);
		
		/* ��ü ���� */
		list.add(1, 70);
		System.out.println(list);
		
		/* ��ü ���� */
		list.remove(3);
		System.out.println(list);
	}
}
