package Ŭ��������;

/*
 * Car Ŭ���� => �θ�(����) Ŭ����
 */
public class Car {
	protected int speed;			// ���� �ӵ�
	protected String wheelNum;	// ������ ����
	protected String carName;		// �ڵ��� �̸�

	// ����Ʈ ������ ����
	public Car() {
		
	}
	
	
	// ������
	public Car(String name) {
		carName = name;
	}
	
	public Car(int velocity) {
		speed = velocity;
	}
	
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;
	}

	// ����� ���� �޼ҵ�
	public void speedUp() {
		speed = speed + 10;
	}
	public void speedUp(int velocity) {
		speed = speed + velocity;
	}
	public void speedDown() {
		speed = speed - 1;
		if (speed < 0) {
			speed = 0;
		}
	}
	public void stop() {
		speed = 0;
	}
	
	/*
	public static void main(String[] args) {
		Car myCar = new Car("���ʽý�");
		System.out.println("����ī�� " + myCar.carName);
		
		Car yourCar = new Car(120);
		System.out.println("����ī�� ���� �ӵ��� " + yourCar.speed);
		
		Car hisCar = new Car("ü���", 150);
		System.out.println(hisCar.carName + "�� ���� �ӵ��� " + hisCar.speed);
	}
	*/
}
