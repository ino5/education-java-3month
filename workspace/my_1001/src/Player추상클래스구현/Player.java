package Player�߻�Ŭ��������;

public class Player {
	PlayerLevel playerLevel;
	
	Player(PlayerLevel playerLevel) {
		this.playerLevel = playerLevel;
	}
	
	public void showInfo() {
		playerLevel.showMessageLevel();
	}
	
	public void play(int count) {
		playerLevel.go(count);
	}
}
