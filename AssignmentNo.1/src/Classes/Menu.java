package Classes;

import java.util.ArrayList;

import java.util.Scanner;

public class Menu {
	
	private Api api;
	private ArrayList <Match> matches;
	java.util.Scanner s;
	
	public Menu() {
		System.out.println("Welcome to football game service!\n");
		api = new Api();
		s = new Scanner(System.in);
	}
	
	public void startMenu() {
		
		System.out.println("Please enter your choice:\n"
				+ "Get matches by team name ----- 1\n"
				+ "get matches by  filtered by match status ----- 2\n"
				+ "Get matches by tournament name ----- 3\n"
				+ "Get matches by tournament name filtered by match status ----- 4\n"
				+ "Exit ----- 5\n");
		
		int choice = s.nextInt();
		s.nextLine();
		
		switch(choice) {
		
			case 1:
				getMatchesByTeamName();
				break;
			case 2:
				getMatchesByTeamNameAndStatus();
				break;
			case 3:
				getMatchesByTournamentName();
				break;
			case 4:
				getMatchesByTournamentNameAndStatus();
				break;
			case 5:
				break;
		}
		

	}
	
	
	private void getMatchesByTeamName() {
		
		System.out.println("Please enter team name:");
		String teamName = s.nextLine();
		
		matches = api.getMatchesListByTeamName(teamName);
		
		printMatches();
		
		startMenu();
	}
	
	private void getMatchesByTeamNameAndStatus() {
		System.out.println("Please enter team name:");
		String teamName = s.nextLine();
		
		System.out.println("Please enter match status:");
		String status = s.nextLine();
		
		matches = api.getMatchesListByTournamentAndStatus(teamName, status);
		
		printMatches();
		startMenu();
	}

	private void getMatchesByTournamentName() {
	
		System.out.println("Please enter tournament name:");
		String tournamentName = s.nextLine();
		
		matches = api.getMatchesListByTeamName(tournamentName);
		
		printMatches();
		startMenu();
	}

	private void getMatchesByTournamentNameAndStatus() {
	
		System.out.println("Please enter tournament name:");
		String tournamentName = s.nextLine();
		
		System.out.println("Please enter match status:");
		String status = s.nextLine();
		
		matches = api.getMatchesListByTournamentAndStatus(tournamentName, status);
		
		printMatches();
		startMenu();
		
	}
	
	private void printMatches() {
		
		for (int i=0 ; i<matches.size(); i++) {
			System.out.println(matches.get(i));
		}
	}
	

	
}
