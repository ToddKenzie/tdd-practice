
public class Player {

	private String name;
	private int score;
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public Player(String name) {
		this.name = name;
		score = 0;
	}

	public void increaseScore() {
		score++;
	}

}
