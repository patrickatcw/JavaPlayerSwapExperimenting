package com.me;

public class Team {

    private String player1;
    private String player2;
    private String player3;
    private String player4;
    private String player5;

    public Team(String player1, String player2, String player3,
                String player4, String player5){

        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.player5 = player5;

    }

    //create method to switch players
    //i want to replace one player with another player on different teams, or
    //bring in a new player not on any teams currently
    public void replacePlayer(String playerNameRemove, String playerNameAdd){
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public String getPlayer3() {
        return player3;
    }

    public String getPlayer4() {
        return player4;
    }

    public String getPlayer5() {
        return player5;
    }

}
