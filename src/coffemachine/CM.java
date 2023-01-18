package CoffeeMachine;

public class CM {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Custom userInputClass = new Custom();
        coffeeMachine.menu(userInputClass);
    }
}