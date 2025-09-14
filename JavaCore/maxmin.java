import java.util.Scanner;

public class maxmin {
    public static void main(String[] args){
        int[] arr=new int[5];
        int min=arr[0];
        int max=arr[0];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Value of "+i+"th element: ");
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Minimum value = "+min);
        System.out.println("Maximum value = "+max);

        sc.close();
    }
}
