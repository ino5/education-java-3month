package �������̽��ǽ�;

public class Television implements RemoteControl{
	
	// ������� ����
	private int volumn;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolumn(int volumn) {
		if (volumn > RemoteControl.MAX_VOLUMN)
			this.volumn = RemoteControl.MAX_VOLUMN;
		else if (volumn < RemoteControl.MIN_VOLUMN)
			this.volumn = RemoteControl.MIN_VOLUMN;
		else
			this.volumn = volumn;
		System.out.println("���� TV ����: " + this.volumn);
	}

}
