/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author nokid4249
 */
public class BaseballTeam extends SportsTeam implements Stats{
    int pitchers, batters, runners;
    
    public BaseballTeam(int players, int win, int loss, int tie, int pitch, int bat, int run){
        super(players,win,loss,tie);
        pitchers = pitch;
        batters = bat;
        runners = run;
    }
    @Override
    public void addWins() {
        wins++;
    }
    @Override
    public void addLosses() {
        losses++;
    }
    @Override
    public void addTies() {
        ties++;
    }
    public void finalScore(){
        int score = finalScore;
    }
    public String toString(){
        String output = "Players " + numOfPlayers + "\n";
        output += "Wins: " + wins + "\n";
        output += "Losses: " + losses + "\n";
        output += "Ties: " + ties + "\n";
        output += "Number of Pitchers: " + pitchers + "\n";
        output += "Number of Batters: " + batters + "\n";
        output += "Number of Runners: " + runners + "\n";
        return output;
}
}
