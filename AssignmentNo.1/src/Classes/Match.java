package Classes;

public abstract class Match {
	
	//Data Members:
	protected String status;
	protected Team homeTeam;
	protected Team awayTeam;
	protected String startDate;
	protected Tournament tournament;
	
	public Match(String status, Team homeTeam, Team awayTeam, String startDate, Tournament tournament) {
		this.status = status;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.startDate = startDate;
		this.tournament = tournament;
	}

	public String getStatus() {
		return status;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public String getStartDate() {
		return startDate;
	}

	public Tournament getTournament() {
		return tournament;
	}
	
	

}
