import java.util.Scanner;

public class multiarr{
    public static void main(String args[]){
        int[][] a= new int[5][2];
        Scanner sc= new Scanner(System.in);
        for(int n=0;n<5;n++){
            for(int m=0; m<2;m++){
            System.out.println("Enter value of "+n+","+m+"th elemnt: ");
            a[n][m]=sc.nextInt();
            }
        }
        for(int n=0; n<5; n++){
            for(int m=0; m<2;m++){
            System.out.println("Value of "+n+","+m+"th elemnt: "+a[n][m]);
            }
        }
        sc.close();
    }
}
