package Classes;

import java.util.ArrayList;

public class Api {
	
	CsvHandler instance;
	ArrayList <Match> matches;
	
	public Api() {
		instance = CsvHandler.getInstance();
		matches = instance.getMatches();
		
	}
		
	public ArrayList <Match> getMatchesListByTeamName(String name) {
			
			ArrayList <Match> M = new ArrayList <Match>();
			
			for (int i=0 ; i<matches.size(); i++) {
				
				String home = matches.get(i).getHomeTeam().getName();
				String away = matches.get(i).getAwayTeam().getName();
				
				if(home.equals(name) || away.equals(name))
					M.add(matches.get(i));
			}
			return M;
		}
	
	public ArrayList <Match> getMatchesListByTeamAndStatus(String name, String status) {
		
		ArrayList <Match> M = new ArrayList <Match>();
		
		for (int i=0 ; i<matches.size(); i++) {
			
			String home = matches.get(i).getHomeTeam().getName();
			String away = matches.get(i).getAwayTeam().getName();
			String matchStatus = matches.get(i).getStatus();
			
			if((home.equals(name) || away.equals(name)) && matchStatus.equals(status))
				M.add(matches.get(i));
		}
		return M;
	}
	
	
	public ArrayList <Match> getMatchesListByTournament(String name) {
		
		ArrayList <Match> M = new ArrayList <Match>();
		
		for (int i=0 ; i<matches.size(); i++) {
			
			String tournamentName = matches.get(i).getTournament().getName();		
			if(tournamentName.equals(name))
				M.add(matches.get(i));
		}
		return M;
	}
	
	public ArrayList <Match> getMatchesListByTournamentAndStatus(String name, String status) {
		
		ArrayList <Match> M = new ArrayList <Match>();
		
		for (int i=0 ; i<matches.size(); i++) {
			
			String tournamentName = matches.get(i).getTournament().getName();
			String matchStatus = matches.get(i).getStatus();
			if(tournamentName.equals(name) && matchStatus.equals(status))
				M.add(matches.get(i));
		}
		return M;
	}
		

}
