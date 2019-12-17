package Main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import Classes.Api;
import Classes.Match;
import Classes.Menu;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		
		Menu menu = new Menu();
		
		menu.startMenu();
	}
		
//		Api api = new Api();
		
//		ArrayList <Match> matches = api.getMatchesListByTeamAndStatus("realMadrid", "upcoming");
//		
//		for (int i=0 ; i<matches.size(); i++) {
//			System.out.println(matches.get(i));
//		}
//		
//	}

}
