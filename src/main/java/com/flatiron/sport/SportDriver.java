package com.flatiron.sport;

public class SportDriver {

    public static void main(String[] args) {
        Sport mySport = new Sport();
        Football footballTeam = new Football();
        Baseball baseballTeam = new Baseball();

        System.out.println("mySport has " + mySport.getTeammates() + " teammates.");
        mySport.play();

        footballTeam.play();
        System.out.println("The footballTeam has " + footballTeam.getTeammates() + " teammates.");
        System.out.println("There are " + footballTeam.getQuarters() + " quarters in football.");
        footballTeam.touchdown();

        baseballTeam.play();
        System.out.println("The baseballTeam has " + baseballTeam.getTeammates() + " teammates.");
        baseballTeam.upToBat();
        baseballTeam.homeRun();
        baseballTeam.outToField();
    }
}
