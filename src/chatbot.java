package ChatBot;
import java.util.Scanner;

public class chatbot {
    public void botName() {
        System.out.println("Hello! My name is Vitaliy");
        System.out.println("I was created in 2222");
        System.out.println("Please, remind me your name.");
        String name = scannerString();
        System.out.println("What a great name you have, " + name + "!");
    }
    public String scannerString() {
        try (Scanner scanner = new Scanner(System.in)){
            return scanner.nextLine();
        }
    }
}