package ohtu;

public class TennisGame {

	private int score1 = 0;
	private int score2 = 0;
	private String player1;
	private String player2;

	public TennisGame(String player1Name, String player2Name) {
		this.player1 = player1Name;
		this.player2 = player2Name;
	}

	public void wonPoint(String playerName) {
		if (playerName == "player1")
			score1 += 1;
		else
			score2 += 1;
	}

	public String getScore() {
		if (score1 == score2) {
			return getDrawScore();
		} else if (score1 >= 4 || score2 >= 4) {
			return getWinScore();
		} else {
			return getRegScore();
		}
	}

	public String getDrawScore() {
		if (score1 == 4) {
			return "Deuce";
		} else {
			return modify(score1) + "-All";
		}
	}

	public String getRegScore() {
		return modify(score1) + "-" + modify(score2);
	}

	public String getWinScore() {
		int difference = score1 - score2;
		String player = "";
		if (difference > 0) {
			player = "player1";
		} else {
			player = "player2";
		}
		if (Math.abs(difference) == 1) {
			return "Advantage " + player;
		} else {
			return "Win for " + player;
		}
	}

	public String modify(int score) {
		if (score == 0) {
			return "Love";
		} else if (score == 1) {
			return "Fifteen";
		} else if (score == 2) {
			return "Thirty";
		} else if (score == 3) {
			return "Forty";
		} else {
			return "Win";
		}

	}
}