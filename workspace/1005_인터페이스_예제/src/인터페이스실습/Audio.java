package �������̽��ǽ�;

public class Audio implements RemoteControl{
	// ������� ����
	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolumn(int volumn) {
		if (volumn > RemoteControl.MAX_VOLUMN)
			this.volumn = RemoteControl.MAX_VOLUMN;
		else if (volumn < RemoteControl.MIN_VOLUMN)
			this.volumn = RemoteControl.MIN_VOLUMN;
		else
			this.volumn = volumn;
		System.out.println("���� Audio ����: " + this.volumn);
		
	}

}
