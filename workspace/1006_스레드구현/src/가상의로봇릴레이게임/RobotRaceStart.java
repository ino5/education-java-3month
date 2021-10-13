package �����Ƿκ������̰���;

class RobotRace extends Thread {
	// ������
	public RobotRace(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i ++ ) {
			System.out.println(getName() + "��" + i*10 + "m����");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}

	}
}

public class RobotRaceStart {
	public static void main(String[] args) {
		RobotRace robotA= new RobotRace("�κ�-A");
		RobotRace robotB= new RobotRace("�κ�-B");
		RobotRace robotC= new RobotRace("�κ�-C");
		
		robotA.start();
		robotB.start();
		robotC.start();
	}
}
