package Test1;

public class Hungry {
    private int hungerLevel;

    // Constructor to initialize the hunger level
    public Hungry(int initialHungerLevel) {
        this.hungerLevel = initialHungerLevel;
    }

    // Method to simulate eating, which decreases the hunger level
    public void eat(int foodAmount) {
        hungerLevel -= foodAmount;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        System.out.println("You ate " + foodAmount + " units of food.");
    }

    // Method to display the current hunger level
    public void displayHungerLevel() {
        System.out.println("Current hunger level: " + hungerLevel);
    }

    // Main method for testing the Hungry class
    public static void main(String[] args) {
        Hungry person = new Hungry(10); // Create a new Hungry object with an initial hunger level of 10
        person.displayHungerLevel();    // Display the initial hunger level

        person.eat(3);                  // Eat 3 units of food
        person.displayHungerLevel();    // Display the hunger level after eating

        person.eat(5);                  // Eat 5 units of food
        person.displayHungerLevel();    // Display the hunger level after eating

        person.eat(4);                  // Eat 4 units of food (hunger level should not go below 0)
        person.displayHungerLevel();    // Display the final hunger level
    }
}
