package Player�߻�Ŭ��������;

public class Intermediate extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("������ �� �ֽ��ϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("���� �� �����ϴ�.");

	}

	@Override
	public void showMessageLevel() {
		System.out.println("�߱��� ����: ������ �޸��� ���� ������ �� �ִ�. ���� �� �𸥴�.");
	}

}
