
package ohtu;

public class Player implements Comparable<Player> {
	private String name;
	private String team;
	private String goals;
	private String nationality;
	private String assists;
	private int points;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNationality() {
		return nationality;
	}

	public void setAssists(String assists) {
		this.assists = assists;
	}

	public int getPoints() {
		points = Integer.valueOf(assists);
		points += Integer.valueOf(goals);
		return points;
	}

	@Override
	public String toString() {
		return name + " " + team + ": " + goals + " goals + " + assists + " assists = " + getPoints() + " points";
	}

	@Override
	public int compareTo(Player arg0) {
		return arg0.getPoints() - getPoints();
	}

}
