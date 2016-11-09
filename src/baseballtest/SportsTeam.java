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
abstract class SportsTeam {

    int numOfPlayers, wins, losses, ties;

    public SportsTeam(int players, int win, int loss, int tie) {
        players = numOfPlayers;
        win = wins;
        loss = losses;
        tie = ties;
    }

    public void addWins() {
        wins++;
    }

    public void addLosses() {
        losses++;
    }

    public void addTies() {
        ties++;
    }
}
