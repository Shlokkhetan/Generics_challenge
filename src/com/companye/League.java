package com.companye;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    public String Name;
    private ArrayList<T> league = new ArrayList<T>();


    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println("The team is already in the league");
            return false;
        }

        league.add(team);
        return true;

    }

    public void showLeague(){
        Collections.sort(league);
        for(T team : league){
            System.out.println(" The team : " + team.getName() + " is at the ranking: " + team.Ranking());
        }
    }
}
