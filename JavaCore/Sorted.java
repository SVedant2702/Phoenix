import java.util.Scanner;

public class Sorted {
    public static void main(String args[]){
        int[] arr=new int[5];
        boolean issorted=true;;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length;i++){
            System.out.println("Enter the "+(i+1)+"th Element: ");
            arr[i]=sc.nextInt();
        }

        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted= false;
                break;
            }
        }
        if (issorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
        sc.close();
    }
}