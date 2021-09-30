package Phone�߻�Ŭ��������;

public abstract class Phone {
	public String ownerName;
	
	
	Phone() {
		
	}
	
	Phone(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public abstract void doAction();
	
	public void turnOn() {
		System.out.println("���� �Ҵ�.");
	}
	
	public void turnOff() {
		System.out.println("���� ����.");
	}
	
	final public void run() {
		turnOn();
		doAction();
		turnOff();
	}
}
