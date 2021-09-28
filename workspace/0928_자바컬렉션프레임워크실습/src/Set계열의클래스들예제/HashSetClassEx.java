package Set�迭��Ŭ�����鿹��;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet�� ��ü�� �����ϱ� ����
 * ���� ��ü�� hashCode() �޼ҵ带 ȣ���ؼ� �ؽ��ڵ� ���� ��´�.
 * �׸��� �̹� ����Ǿ� �ִ� ��ü���� �ؽ��ڵ�� ���Ѵ�.
 * ���� ������ �ؽ��ڵ尡 �ִٸ� equals() �޼ҵ�� �� ��ü�� ���ؼ�
 * true�� ������ ������ ��ü�� �Ǵ��ϰ� �ߺ� ������ ���� �ʴ´�.
 * 
 */

public class HashSetClassEx {

	public static void main(String[] args) {
		// HashSet ��ü ����
		Set<Member> member_set = new HashSet<Member>();
		
		Member member1 = new Member("�����", 29, "111111-1111111");
		Member member2 = new Member("�����", 29, "111111-1111111");
//		Member member3 = new Member("������", 30, "111111-2222222");
		
		member_set.add(member1);
		member_set.add(member2);
//		member_set.add(member3);
		
		System.out.println("�� ��ü��: " + member_set.size());
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		
		System.out.println(member1.equals(member2));

	}

}
