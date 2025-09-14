import java.util.Scanner;

public class rev {
    public static void main(String[] args){
        int[] arr=new int[5];
        int[] revarr=new int[5];
        int j=0;

        Scanner sc= new Scanner(System.in);

        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the "+i+"th Element: ");
            arr[i]=sc.nextInt();
        }
        for(int i = arr.length-1; i>=0; i--){
            revarr[j]=arr[i];
            j++;
        }
        System.out.println("Reversed array: ");
        for(int i =0;i<revarr.length;i++){
            System.out.print(revarr[i]+" ");
        }
        sc.close();
    }
}
