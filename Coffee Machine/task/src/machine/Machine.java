package machine;

public class Machine {
    private int amountOfWater;
    private int amountOfMilk;
    private int amountOfCoffee;

    public void setAmountOfWater(int amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public void setAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk = amountOfMilk;
    }

    public void setAmountOfCoffee(int amountOfCoffee) {
        this.amountOfCoffee = amountOfCoffee;
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public int getAmountOfMilk() {
        return amountOfMilk;
    }

    public int getAmountOfCoffee() {
        return amountOfCoffee;
    }

    public void amountOfCupsPossible(int amountOfCups) {
        int maxCups = calculateMaxCups();

        if (amountOfCups > maxCups) {
            System.out.printf("No, I can make only %d cup(s) of coffee", maxCups);
        } else if (amountOfCups < maxCups) {
            System.out.printf("Yes, I can make that amount of coffee and even %d more than that"
                    , maxCups - amountOfCups);
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }

    private int calculateMaxCups() {
        return Math.min(Math.min(amountOfWater / 200, amountOfMilk / 50), amountOfCoffee / 15);
    }

}
