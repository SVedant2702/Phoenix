import java.util.Scanner;

public class Constr {
    // Instance variables
    private String name;
    private int rno;
    private double percentage;

    // Constructor
    public Constr(String name, int rno, double percentage) {
        this.name = name;
        this.rno = rno;
        this.percentage = percentage;
    }

    // Getter methods
    public String getName() {
        return this.name;
    }

    public int getRno() {
        return this.rno;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rno = sc.nextInt();

        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

        // Creating object using constructor
        Constr student = new Constr(name, rno, percentage);

        // Displaying the values
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRno());
        System.out.println("Percentage: " + student.getPercentage());
    }
}
