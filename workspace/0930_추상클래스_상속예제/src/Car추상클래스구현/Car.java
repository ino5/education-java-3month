package Car�߻�Ŭ��������;

public abstract class Car { // �߻� Ŭ����
	// �߻� �޼ҵ�
	public abstract void drive(); // '�޸���' ����� ���� �ٸ��� ������
	public abstract void stop(); // '����' ����� ���� �ٸ��� ������
	public abstract void wipe();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// ���ø� �޼ҵ�� final ���� ����� �����Ѵ�. 'Ʋ'�� �ִ� �޼ҵ� �ǹ�!!
	/*
	 * �޼ҵ� '���� ����'�� '�ó�����'�� ������ ���̴�.
	 */
	final public void run() {
		startCar();
		drive();
		wipe();
		stop();
		turnOff();
	}
}
