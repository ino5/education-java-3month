package Set�迭��Ŭ�����鿹��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoGeneratorEx {
	public static void main(String[] args) {
		Random random = new Random();
//		Set<Integer> set = new HashSet<Integer>();
		/*
		 * TreeSet�� ������ �� �̹� �����ϱ� ������ �о�� �� ���� �������ʿ䰡 ����.
		 * TreeSet�� Binary Search Tree�� ���·� �����͸� �����ϴ� �÷����̴�.
		 */
		Set<Integer> set = new TreeSet<Integer>(); 
		while (set.size() != 6) {
			int num = random.nextInt(45) + 1;
			set.add(num);
		}
//		List<Integer> list = new ArrayList<Integer>(set);
//		Collections.sort(list);
//		System.out.println(list);
		System.out.println(set);
	}
}
