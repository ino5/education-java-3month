package Phone�߻�Ŭ��������;

public class PhoneTest {
	public static void main(String[] args) {
		System.out.println("<< SmartPhone �׽�Ʈ >>");
		Phone phone = new SmartPhone("abc");
		phone.run();
		System.out.println();
		
		System.out.println("<< TelePhone �׽�Ʈ >>");
		Phone phone2 = new TelePhone("def");
		phone2.run();
	}
}
