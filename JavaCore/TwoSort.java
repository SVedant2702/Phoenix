import java.util.Scanner;

public class TwoSort {
    public static void main(String[] args){
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 3 elements of array 1 (sorted):");
        for(int i = 0; i < arr1.length; i++){
            System.out.print("Element " + (i+1) + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the 3 elements of array 2 (sorted):");
        for(int i = 0; i < arr2.length; i++){
            System.out.print("Element " + (i+1) + ": ");
            arr2[i] = sc.nextInt();
        }

        int a1 = arr1.length;
        int b1 = arr2.length;
        int c = a1 + b1;
        int[] merged = new int[c];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < a1 && j < b1) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < a1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j < b1) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // Print merged array
        System.out.println("\nMerged Sorted Array:");
        for (int x : merged) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
