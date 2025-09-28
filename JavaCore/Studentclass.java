import java.util.Scanner;

public class Studentclass {
    String name;
    int rno;
    double percent;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Studentclass x = new Studentclass();

        System.out.println("Enter name, roll no and percentage:");
        x.name = sc.next();       // take name as string
        x.rno = sc.nextInt();     // take roll number as int
        x.percent = sc.nextDouble(); // take percentage as double

        // Optional: Print to confirm inputs
        System.out.println("Student Details:");
        System.out.println("Name: " + x.name);
        System.out.println("Roll No: " + x.rno);
        System.out.println("Percentage: " + x.percent);
    }
}
