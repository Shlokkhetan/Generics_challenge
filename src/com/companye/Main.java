package com.companye;

public class Main {
    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer mat = new FootballPlayer("Mat");
        FootballPlayer shlok = new FootballPlayer("Shlok");

        League<Team<FootballPlayer>> footballleague = new League<>();


        Team<FootballPlayer> Indians = new Team<>("Indians");
        Indians.addPlayer(joe);
        Team<FootballPlayer> Cubs = new Team<>("Cubs");
        Cubs.addPlayer(mat);
        Team<FootballPlayer> madrid = new Team<>("Madrid");
        madrid.addPlayer(shlok);
        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        chelsea.addPlayer(shlok);
        Team<FootballPlayer> manchester = new Team<>("Manchester United");
        manchester.addPlayer(shlok);

        footballleague.addTeam(chelsea);
        footballleague.addTeam(manchester);
        footballleague.addTeam(madrid);

        madrid.matchResult(chelsea, 3, 4);
        madrid.matchResult(manchester, 4,2);
        chelsea.matchResult(chelsea, 2,4);
        manchester.matchResult(madrid,2,2);

        footballleague.showLeague();





	// write your code here
    }
}
