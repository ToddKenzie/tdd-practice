import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisTest {

	Tennis underTest = new Tennis();
	Player player1 = new Player("Todd");
	Player player2 = new Player("Alan");

	@Test
	public void checkThat0Score0IsLove() {
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Love-Love"));
	}

	@Test
	public void checkThat1Score0IsFifteen() {
		player1.increaseScore();
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Fifteen-Love"));
	}

	@Test
	public void checkThat2Score0IsThirty() {
		player1.increaseScore();
		player1.increaseScore();
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Thirty-Love"));
	}


	@Test
	public void checkThat3Score0IsFortyLove() {
		player1.increaseScore();
		player1.increaseScore();
		player1.increaseScore();
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Forty-Love"));
	}

	@Test
	public void checkThat3Score1IsFortyFifteen() {
		player1.increaseScore();
		player1.increaseScore();
		player1.increaseScore();
		player2.increaseScore();
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Forty-Fifteen"));
	}
	
	@Test
	public void checkThat3Score3IsDeuce() {
		player1.increaseScore();
		player1.increaseScore();
		player1.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Deuce"));
	}

	@Test
	public void checkThat4Score3IsAdvantageTodd() {
		player1.increaseScore();
		player1.increaseScore();
		player1.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		player1.increaseScore();
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Advantage: Todd"));
	}

	@Test
	public void checkThat4Score5IsAdvantageAlan() {
		player1.increaseScore();
		player1.increaseScore();
		player1.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		player1.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Advantage: Alan"));
	}

	@Test
	public void checkThat4Score6IsGameAlan() {
		player1.increaseScore();
		player1.increaseScore();
		player1.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		player1.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		player2.increaseScore();
		String score = underTest.retrieveGameScore(player1, player2);
		assertThat(score, is("Game: Alan"));
	}




}
