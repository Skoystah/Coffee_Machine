package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner ipt = new Scanner(System.in);
        Machine machine1 = new Machine();

        System.out.println("Write how many ml of water the coffee machine has:");
        machine1.setAmountOfWater(ipt.nextInt());

        System.out.println("Write how many ml of milk the coffee machine has:");
        machine1.setAmountOfMilk(ipt.nextInt());

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        machine1.setAmountOfCoffee(ipt.nextInt());

        System.out.println("Write how many cups of coffee you will need:");
        machine1.amountOfCupsPossible(ipt.nextInt());
/*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
*/

    }
/*
    public static void printIngredients(int amountOfCups) {

        long amountOfWater  = amountOfCups * 200;
        long amountOfMilk   = amountOfCups * 50;
        long amountOfCoffee = amountOfCups * 15;

        System.out.printf("For %d cups of coffee you will need:%n", amountOfCups);
        System.out.printf("%d ml of water%n", amountOfWater);
        System.out.printf("%d ml of milk%n", amountOfMilk);
        System.out.printf("%d g of coffee beans%n", amountOfCoffee);

    }*/
}
