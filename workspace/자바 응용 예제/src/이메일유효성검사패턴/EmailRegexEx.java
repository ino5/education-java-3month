package �̸�����ȿ���˻�����;

/*
 * �̸��� �����Ϳ� ��ȿ�� �˻� ���� ����
 */

public class EmailRegexEx {
	public static void main(String[] args) {
		String[] email_ex = {"king5901@naver.com",
							 "kim1234@gmail.com",
							 "erin0521@partner.sk.com��",
							 "asd456@partner.sk.com.aaa"};
		// �̸��� ����
		String email_pattern = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		for (String email : email_ex) {
			boolean check = email.matches(email_pattern);
			
			if (check == true) {
				System.out.println("������ �̸���: " + email);
			} else {
				System.out.println("�������� �̸���: " + email);
			}
		}
	}

}
