package Hangman;

import java.util.*;
import java.util.regex.Pattern;

public class Hangman {
    private List<String> words = Arrays.asList("python", "java", "javascript", "kotlin");

    private Scanner user_answer = new Scanner(System.in);

    private Random rand = new Random();

    private String word = words.get(rand.nextInt(words.size()));

    private List<Character> user_guess = new ArrayList<>();

    private int wrong_answer = 0;

    public void play() {
        while(true) {
            if (print_Result()) {
                System.out.println("You guessed the word java!\n" +
                        "You survived!");
                user_answer.close();
                break;
            }

            if (!get_user_guesses()) {
                wrong_answer++;
                System.out.println("That letter doesn`t appear in the word");
            }

            if (wrong_answer == 9) {
                System.out.println("You lost!");
                user_answer.close();
                break;
            }


        }
    }

    public boolean print_Result() {
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (user_guess.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctCount++;
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        return word.length() == correctCount;
    }

    public boolean get_user_guesses() {
        System.out.print("Input a letter:>");
        String latterGuess = user_answer.nextLine();
        String regExp = "[a-z]";
        boolean correctWord = Pattern.matches(regExp,latterGuess);
        boolean checkCorrect = true;
        if (latterGuess.length() != 1) {
            System.out.println("You should input a single letter.");
        } else if (!correctWord){
            System.out.println("Please enter a lowercase English letter.");
        } else if (!word.contains(latterGuess)){
            checkCorrect = false;
        } else if (!user_guess.contains(latterGuess.charAt(0))){
            user_guess.add((latterGuess.charAt(0)));
        } else {
            System.out.println("You`ve already guessed this letter.");
        }

        return checkCorrect;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public Scanner getUser_answer() {
        return user_answer;
    }

    public void setUser_answer(Scanner user_answer) {
        this.user_answer = user_answer;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Character> getUser_guess() {
        return user_guess;
    }

    public void set_user_guess(List<Character> user_guess) {
        this.user_guess = user_guess;
    }
}