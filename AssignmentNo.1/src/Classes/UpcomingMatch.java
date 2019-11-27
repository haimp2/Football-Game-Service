package Classes;

public class UpcomingMatch extends Match {
	
	//Data Members:
	private String kickOffTime;
	
	public UpcomingMatch(Team homeTeam, Team awayTeam, String startDate, String kickOffTime, Tournament tournament) {
		super("upcoming" , homeTeam, awayTeam, startDate, tournament);
		
		this.kickOffTime = kickOffTime;
	}
	
	public String getKickOffTime() {
		return kickOffTime;
	}

	@Override
	public String toString() {
		return "UpcomingMatch [kickOffTime=" + kickOffTime + ", status=" + status + ", homeTeam=" + homeTeam
				+ ", awayTeam=" + awayTeam + ", startDate=" + startDate + ", tournament=" + tournament + "]";
	}
	
	
	

}
