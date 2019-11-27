package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class CsvHandler {
	
	private static CsvHandler instance;
	private static ArrayList <Match> matches;
	private static Set<Team> teams;
	private static Set<Tournament> tournaments;
	
	//Global File Handling Variables 
	String upcomingStr = "src/csv/UpcomingMatches.csv";
	String finishedStr = "src/csv/FinishedMatches.csv";
	String data = new String();

	
	private CsvHandler () {
		
		matches = new ArrayList <Match>();
		teams =  new HashSet<Team>();
		tournaments = new HashSet<Tournament>();
		
		try {
			initTeamsAndTournaments();
			initMatches();
		}
		catch(Exception e){
			System.out.println("File Not Found!");
		}
	}
	
	public ArrayList <Match> getMatches() {
		return new ArrayList <Match>(matches);
	}
	
	
	private void initTeamsAndTournaments() throws IOException{
		
		BufferedReader inputStream = new BufferedReader(new FileReader(upcomingStr));
		
		inputStream.readLine();
		
		while((data = inputStream.readLine())!= null) {
			
			String[] dataList = data.split(",");
			
			teams.add(new Team(dataList[0]));
			teams.add(new Team(dataList[1]));
			tournaments.add(new Tournament(dataList[4]));
			
		}
		
		inputStream.close();
		
		//-------------------------------------------------
		
		inputStream = new BufferedReader(new FileReader(finishedStr));
		
		inputStream.readLine();
		
		while((data = inputStream.readLine())!= null) {
			
			String[] dataList = data.split(",");
			
			teams.add(new Team(dataList[0]));
			teams.add(new Team(dataList[1]));
			tournaments.add(new Tournament(dataList[4]));
			
		}
		
		inputStream.close();
	}
	
	
	private Team getTeam(String team) {
		
		Iterator<Team> it = teams.iterator();
		
		while(it.hasNext()) {
			Team T = it.next();
			if(T.getName().equals(team))
				return T;
		}
		
		return new Team("");
	}
	
	private Tournament getTournament(String tournament) {
		 
		for (Iterator<Tournament> it = tournaments.iterator(); it.hasNext(); ) {
		        Tournament T = it.next();
		        if (T.getName().equals(tournament))
		            return T;
		}
		return new Tournament("");
	}
	
	
	
	private void initMatches() throws IOException {
		
		BufferedReader inputStream = new BufferedReader(new FileReader(upcomingStr));
		
		inputStream.readLine();
		
		while((data = inputStream.readLine())!= null) {
			
			String[] dataList = data.split(",");
			
			Team home = getTeam(dataList[0]);
			Team away = getTeam(dataList[1]);
			String date = dataList[2];
			String time = dataList[3];
			Tournament tournament = getTournament(dataList[4]);
			
			UpcomingMatch upcomingMatch = new UpcomingMatch(home, away, date, time, tournament);
			matches.add(upcomingMatch);
		}
		
		inputStream.close();
		
		//-------------------------------------------------
		
		inputStream = new BufferedReader(new FileReader(finishedStr));
		
		inputStream.readLine();
		
		while((data = inputStream.readLine())!= null) {
			
			String[] dataList = data.split(",");
			
			Team home = getTeam(dataList[0]);
			Team away = getTeam(dataList[1]);
			String date = dataList[2];
			String score = dataList[3];
			Tournament tournament = getTournament(dataList[4]);
			
			FinishedMath finishedMatch = new FinishedMath(home, away, date, score, tournament);
			matches.add(finishedMatch);
		}
		
		inputStream.close();
	}
	
	
	public static CsvHandler getInstance() {
		if (instance == null) {
			instance = new CsvHandler();
		}
		return instance;
	}
	
	
	
	
	
//	Set <Team> teams = new HashSet <Team> ();
//	Set <Tournament> tournaments = new HashSet <Tournament> ();
//	
//	private Set <Team> makeTeamsSet() {
//		
//		String fileName_1 = "csv/FinishedMatches.csv";
//		String fileName_2 = "csv/UpcomingMatches.csv";
//		
//		File file_1 = new File(fileName_1);
//		File file_2 = new File(fileName_2);
//		
//		try {
//			
//			Scanner inputStream = new Scanner(file_1);
//			inputStream.next();
//			
//			while(inputStream.hasNext()) {
//				String data = inputStream.next();
//				String[] values = data.split(",");
//				
//				Team team = new Team(values[0]);
//				teams.add(team);
//				
//				team = new Team(values[1]);
//				teams.add(team);
//				
//			}
//			inputStream.close();
//			
//			inputStream = new Scanner(file_2);
//			inputStream.next();
//			
//			while(inputStream.hasNext()) {
//				String data = inputStream.next();
//				String[] values = data.split(",");
//				
//				Team team = new Team(values[0]);
//				teams.add(team);
//				
//				team = new Team(values[1]);
//				teams.add(team);
//				
//			}
//			inputStream.close();
//			
//			return teams;
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return teams;
//		}
//		
//	}
//	
//	private Set <Tournament> makeTournamentSet(){
//		
//		String fileName_1 = "csv/FinishedMatches.csv";
//		String fileName_2 = "csv/UpcomingMatches.csv";
//		
//		File file_1 = new File(fileName_1);
//		File file_2 = new File(fileName_2);
//		
//		try {
//			
//			Scanner inputStream = new Scanner(file_1);
//			inputStream.next();
//			
//			while(inputStream.hasNext()) {
//				String data = inputStream.next();
//				String[] values = data.split(",");
//				
//				Tournament tournament = new Tournament(values[4]);
//				tournaments.add(tournament);
//		
//				
//			}
//			inputStream.close();
//			
//			inputStream = new Scanner(file_2);
//			inputStream.next();
//			
//			while(inputStream.hasNext()) {
//				String data = inputStream.next();
//				String[] values = data.split(",");
//				
//				Tournament tournament = new Tournament(values[4]);
//				tournaments.add(tournament);
//				
//			}
//			inputStream.close();
//			
//			return tournaments;
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return tournaments;
//		}
//		
//	}
	

}
