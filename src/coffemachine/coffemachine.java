package CoffeeMachine;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Scanner;

public class CoffeeMachine {
    private int money = 550;
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cup = 9;

    private void printInfo(Custom user) {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cup + " of disposable cups\n" +
                money + " of money");

        menu(user);
    }


    public void menu(Custom user) {
        System.out.print("Write action (buy, fill, take, remaining, exit):\n" +
                ">");
        switch (user.userInput()) {
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back – to\n" +
                        "main menu:\n>");
                switch (user.userInput()) {
                    case "1":
                        espresso(user);
                        break;
                    case "2":
                        latte(user);
                        break;
                    case "3":
                        cappuccino(user);
                        break;
                    case "back":
                        menu(user);
                        break;
                }
                break;
            case "fill":
                fill(user);
                break;
            case "take":
                take(user);
                break;
            case "remaining":
                printInfo(user);
                break;
            case "exit":
                System.exit(0);
                break;
        }
    }

    private void espresso(Custom user) {
        if(water >= 250 && beans >= 16 && cup >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            beans -= 16;
            cup -= 1;
            money += 4;
            menu(user);
        } else if(water < 250){
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (beans < 16) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");
            menu(user);
        }
    }

    private void latte(Custom user) {
        if(water >= 350 && milk >= 75 && beans >= 20 && cup >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            beans -= 20;
            cup -= 1;
            money += 7;
            menu(user);
        } else if(water < 350){
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
            menu(user);
        } else if (beans < 20) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");
            menu(user);
        }
    }

    private void cappuccino(Custom user) {
        if(water >= 200 && milk >= 100 && beans >= 12 && cup >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            beans -= 12;
            cup -= 1;
            money += 6;
            menu(user);
        } else if(water < 200){
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
            menu(user);
        } else if (beans < 12) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");
            menu(user);
        }
    }

    private void fill(Custom user) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write how many ml of water you want to add:\n>");
        water += userInput.nextInt();
        System.out.print("Write how many ml of milk you want to add:\n>");
        milk += userInput.nextInt();
        System.out.print("Write how many grams of coffee beans you want to add:\n>");
        beans += userInput.nextInt();
        System.out.print("Write how many disposable coffee cups you want to add:\n>");
        cup += userInput.nextInt();
        menu(user);
    }

    private void take(Custom user) {
        System.out.println("I gave you " + money);
        money = 0;
        menu(user);
    }


    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
=======
public class CoffeeMachine {
    public void printText() {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!\n");
>>>>>>> 4a375fa (st-1 coffemachine)
=======
import java.util.Scanner;

public class CoffeeMachine {
<<<<<<< HEAD
    private int water;
    private int milk;
    private int beans;
    private int cups;

    public void amountOfCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has:\n" +
                ">");
        this.water = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has:\n" +
                ">");
        this.milk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has:\n" +
                ">");
        this.beans = scanner.nextInt();
        System.out.print("Write how many cups of coffee you will need:\n" +
                ">");
<<<<<<< HEAD
        int userInput = scanner.nextInt();
        System.out.println("For " + userInput+ " cups of coffee you will need:");
        System.out.println(userInput * 200 + " ml of water");
        System.out.println(userInput * 50 + " ml of milk");
        System.out.println(userInput * 15 + " of coffee beans");
>>>>>>> bc2a763 (st-2 coffemachine)
=======
        this.cups = scanner.nextInt();
=======
    private int milk = 540;
    private int beans = 120;
    private int cup = 9;
    private int money = 550;
    private int water = 400;
>>>>>>> 7f5feb6 (st-4 coffemachine)

    public void printInfo() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cup + " of disposable cups\n" +
                money + " of money");
    }

    public void menu() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take):\n" +
                ">");
        String userChoose = userInput.next();
        switch (userChoose) {
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:\n>");
                String userChooseCoffee = userInput.next();
                switch (userChooseCoffee) {
                    case "1":
                        espresso();
                        break;
                    case "2":
                        latte();
                        break;
                    case "3":
                        cappuccino();
                        break;
                }
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }
    }

    public void espresso() {
        water -= 250;
        beans -= 16;
        cup -= 1;
        money += 4;

        printInfo();
    }

    public void latte() {
        water -= 350;
        milk -= 75;
        beans -= 20;
        cup -= 1;
        money += 7;

        printInfo();
    }

    public void cappuccino() {
        water -= 200;
        milk -= 100;
        beans -= 12;
        cup -= 1;
        money += 6;

        printInfo();
    }

    public void fill() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write how many ml of water you want to add:\n>");
        water += userInput.nextInt();
        System.out.print("Write how many ml of milk you want to add:\n>");
        milk += userInput.nextInt();
        System.out.print("Write how many grams of coffee beans you want to add:\n>");
        beans += userInput.nextInt();
        System.out.print("Write how many disposable coffee cups you want to add:\n>");
        cup += userInput.nextInt();

        printInfo();
    }

    public void take() {
        System.out.println("I gave you " + money);
        money = 0;

        printInfo();
    }


    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
>>>>>>> ed969a4 (st-3 coffemachine)
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }
}