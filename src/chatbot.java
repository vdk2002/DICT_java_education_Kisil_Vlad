package ChatBot;
import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello! My name is Vitaliy");
            System.out.println("I was created in 2222");
            System.out.println("Please, remind me your name.");
            String name = scanner.nextLine();
            System.out.println("What a great name you have, " + name + "!");
            System.out.println("Let me guess your age.");
            System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
            int remainder3 = scanner.nextInt() % 3;
            int remainder5 = scanner.nextInt() % 5;
            int remainder7 = scanner.nextInt() % 7;
            int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
            System.out.println("Your age is " + age + "; that`s a good time to start programming!");
            System.out.println("Now I will prove to you that I can  count to any number you want");
            int numb = scanner.nextInt();
            for (int i = 0; i <= numb; i++) {
                System.out.println(i + "!");
            }
            System.out.println("Let`s test you knowledge. \nWhat is debugging?" +
                    "\n1. It is the process of finding and fixing bugs in a program. " +
                    "\n2. It is a method of postponing processes. " +
                    "\n3. It is a finite set of steps that, when followed, solve some problem. " +
                    "\n4. This is debugging.");
            while (true) {
                int answer = scanner.nextInt();
                if (answer == 1){
                    System.out.println("Great, you right!");
                    break;
                }
                System.out.println("Please, try again.");
            }
            System.out.println("Goodbye, have a nice day!");
        }
    }
}