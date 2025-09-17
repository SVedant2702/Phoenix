import java.util.Scanner;

public class RString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Step 2: Convert to char array
        char[] arr = str.toCharArray();

        // Step 3: Traverse in reverse order
        System.out.print("Reversed string: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}
