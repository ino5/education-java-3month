package Car�߻�Ŭ��������;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� �����մϴ�.");
		
	}

	@Override
	public void wipe() {
		System.out.println("����� ������ �����⸦ �����մϴ�.");
	}

}
