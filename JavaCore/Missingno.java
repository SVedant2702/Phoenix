import java.util.Scanner;

public class Missingno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements in sorted order:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Find missing number in sequence
        for(int i=0; i<n-1; i++){
            if(arr[i+1] != arr[i] + 1){
                System.out.println("Missing number: " + (arr[i] + 1));
                break;  // stop after finding first missing
            }
        }

        sc.close();
    }
}
