package Classes;

public class FinishedMath extends Match {
	
	//Data Members:
	private String score;
	
	public FinishedMath(Team homeTeam, Team awayTeam, String startDate, String score, Tournament tournament){
		super("played" , homeTeam, awayTeam, startDate, tournament);
		
		this.score = score;
		
	}

	public String getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "FinishedMath [score=" + score + ", status=" + status + ", homeTeam=" + homeTeam + ", awayTeam="
				+ awayTeam + ", startDate=" + startDate + ", tournament=" + tournament + "]";
	}
	
	

}
