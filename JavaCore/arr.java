import java.util.Scanner;

public class arr {
    public static void main(String args[]){
        int[] a= new int[5];
        int i = 0;
        Scanner sc= new Scanner(System.in);
        for(int n=0;n<5;n++){
            System.out.println("Enter value of "+n+"th elemnt: ");
            a[n]=sc.nextInt();
        }
        for(int n=0; n<5; n++){
            System.out.println("Value of "+n+"th elemnt: "+a[i]);
            i=i+1;
        }
        sc.close();
    }
}
