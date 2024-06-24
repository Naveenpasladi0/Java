package classandobjects;

public class Car {
    // Fields
    private String color;
    private String model;
    private int year;

    // Constructor
    public Car(String colour, String model, int year) {
        this.color = colour;
        this.model = model;
        this.year = year;
    }

    // Method to get cars details
    public void displayDetails() {
        System.out.println("Car Model " + model);
        System.out.println("Car Color " + color);
        System.out.println("Car Year" + year);
    }

    // Getter and Setter method
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects using the Car class
        Car car1 = new Car("Red", "Toyota Camry", 2020);
        Car car2 = new Car("Golden", "MG Gloster", 2023);

        // Access and modifying fields using getter and setter methods for car1
        car1.setColor("Black");
        System.out.println("Updated Toyota Camry Color Is " + car1.getColor());

        // Access and modifying fields using getter and setter methods for car2
        car2.setColor("Grey Phantom");
        System.out.println("Updated MG Gloster Color Is " + car2.getColor());
    }
}