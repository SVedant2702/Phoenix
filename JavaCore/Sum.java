import java.util.Scanner;

public class Sum {
    public static void main(String args[]){
        int[] arr=new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the "+i+"th Element: ");
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum is: "+sum);

        sc.close();
    }
}
