package com.me;

public class Main {

    public static void main(String[] args) {

        Team blue = new Team("Bob", "Bill", "Bo", "Ben", "Buck");
        Team red = new Team("Rick", "Rob", "Rita", "Renee", "Rudy");
        Team orange = new Team("Otter", "Othello", "Oscar", "Octavian", "Oren");
        Team neon = new Team("Nancy", "Ned", "Nelly", "Nick", "Natalie");
        Team purple = new Team("Pete", "Pam", "Pandit", "Phun-shu", "Pogo");

        System.out.println("-------------------------------------------------");
        System.out.println("Here are the team rosters for the player swap;");
        System.out.println();
        printTeam(blue, "Blue");
        printTeam(red, "Red");
        printTeam(orange, "Orange");
        printTeam(neon, "Neon");
        printTeam(purple, "Purple");
        System.out.println("-------------------------------------------------");

    }

    private static void printTeam(Team team, String teamName) {
        System.out.println("Team " + teamName + ": " + team.getPlayer1() + ", " + team.getPlayer2() + ", " +
                team.getPlayer3() + ", " + team.getPlayer4() + ", " + team.getPlayer5());

    }


}
