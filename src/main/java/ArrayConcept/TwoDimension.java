package ArrayConcept;

import java.util.Scanner;
import java.util.Arrays;

public class TwoDimension {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of index: ");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int arr[][]=new int[a1][a2];

        System.out.println("Enter the array value: ");
        for(int i=0;i<a1;i++){
            for(int j=0;j< a2;j++){
               arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("data of array");
        for(int i=0;i<a1;i++){
            for(int j=0;j<a2;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }


    }
}
