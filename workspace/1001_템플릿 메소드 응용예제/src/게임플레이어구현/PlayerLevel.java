package �����÷��̾��;

public abstract class PlayerLevel {
	// �߻� �޼ҵ�
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// ���ø� �޼ҵ� ���� => ���� �÷��̾� '�ó�����' => ��ü Ŭ�������� ������ �� �� ����.
	final public void go(int count) {
		run();
		
		for (int i = 0; i < count; i++) {
			jump();
		}
		
		turn();
	}
}
