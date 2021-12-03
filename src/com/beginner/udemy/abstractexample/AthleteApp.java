package com.beginner.udemy.abstractexample;
public class AthleteApp {

    public static void main(String[] args) {
      
        FootballPlayer tom = new FootballPlayer("Tom Brady", "Tom Terrific", 1977, "Tampa Bay", 285, 9988, 6377);
        tom.increaseCompletions(35);
        tom.increasePassingYards(17);
        FootballPlayer ed = new FootballPlayer("Ed Brady", "Ed Terrific", 1979, "New England Patriots", 265, 8988, 4377);
        ed.setTeam("Tampa Bay");

        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = ed;

        for (FootballPlayer footballPlayer : footballPlayers) {
            System.out.println("-------------------------------------");
            footballPlayer.compete();
            System.out.println("-------------------------------------");
            footballPlayer.getBio();
            System.out.println(footballPlayer.getBodyType());
        }

        Swimmer katinka = new Swimmer("Katinka Hosszu", "Iron lady", 1989, "Team Iron", 542, 845);
        System.out.println("-------------------------------------");
        katinka.compete();
        System.out.println("-------------------------------------");
        katinka.getBio();
        System.out.println(katinka.getBodyType());
    }
}
