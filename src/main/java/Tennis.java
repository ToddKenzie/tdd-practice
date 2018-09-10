
public class Tennis {

	public String retrieveGameScore(Player player1, Player player2) {
		String totalScore = null;
		
		int p1Score = player1.getScore();
		int p2Score = player2.getScore();
		
		if (p1Score < 3 || p2Score < 3 ) {
		String score1 = retrieveGameScore(p1Score);
		String score2 = retrieveGameScore(p2Score);
		
		totalScore =  score1 + "-" + score2;
		} else if (p1Score == p2Score) {
			totalScore = "Deuce";
		} else if (Math.abs(p1Score - p2Score) == 1) {
			String advantage = (p1Score > p2Score) ? player1.getName(): player2.getName();
			totalScore = "Advantage: " + advantage;
		} else {
			String gameWinner = (p1Score > p2Score) ? player1.getName(): player2.getName();
			totalScore = "Game: " + gameWinner;
		}
		
		return totalScore;
	}

	private String retrieveGameScore(int score) {
		String scoreWord = "Love";
		
		if (score == 1) {
			scoreWord = "Fifteen";
		} else if (score == 2) {
			scoreWord = "Thirty";
		} else if (score == 3) {
			scoreWord = "Forty";
		}
		
		return scoreWord;
	}
	
}
