import java.util.Scanner;

// Class with encapsulation
class Person {
    private int age;
    private String name;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age (with validation)
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

// Main class
public class Encap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.println("Enter the name:");
        String inputName = sc.next();
        p.setName(inputName);

        System.out.println("Enter the age:");
        int inputAge = sc.nextInt();
        p.setAge(inputAge);

        // Display the data
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        sc.close();
    }
}
