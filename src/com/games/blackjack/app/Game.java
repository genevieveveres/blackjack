package com.games.blackjack.app;

import com.games.blackjack.Dealer;

import java.util.Scanner;

public class Game {
    private Dealer dealer;
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        int numPlayers = promptForNumPlayers();
        promptForPlayerNames();
        //dealer.dealCards();

    }

    private void promptForPlayerNames() {
    }

    private int promptForNumPlayers() {
        return 0;
    }

    private void welcome() {
        System.out.println("W E L C O M E  T O  B L A C K J A C K");
    }

}