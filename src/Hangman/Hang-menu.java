package Hangman;

import java.util.Scanner;

public class Hang_menu {
    public void hangmanMenu(Scanner scanner, Hangman hangmen) {
        System.out.println("Type \"play\" to play the game, \"exit\" to quit:");
        String scannerAnswer = scanner.nextLine();
        if (scannerAnswer.equals("play")) {
            hangmen.play();
        } else if (scannerAnswer.equals("exit")) {
            System.exit(0);
        } else {
            hangmanMenu(scanner, hangmen);
        }
    }
}