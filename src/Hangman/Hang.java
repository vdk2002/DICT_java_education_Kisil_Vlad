package Hangman;

import java.util.Scanner;

public class Hang {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Hangman hangmen = new Hangman();
        Hang_menu menu = new Hang_menu();
        menu.hangmanMenu(user, hangmen);
    }
}