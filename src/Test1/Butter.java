package Test1;

public class Butter {
	// Attributes
	private String brand;
	private double weight; // in grams
	private boolean salted;

	// Constructor
	public Butter(String brand, double weight, boolean salted) {
		this.brand = brand;
		this.weight = weight;
		this.salted = salted;
	}

	// Getter and Setter methods
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isSalted() {
		return salted;
	}

	public void setSalted(boolean salted) {
		this.salted = salted;
	}

	// Method to display butter details
	public void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Weight: " + weight + " grams");
		System.out.println("Salted: " + (salted ? "Yes" : "No"));
	}

	// Main method for testing
	public static void main(String[] args) {
		Butter myButter = new Butter("Land O'Lakes", 250, true);
		myButter.displayDetails();
	}
}
