package Programs;

import java.util.Scanner;

public class ArrayBinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr=str.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        float avg=sum/arr.length;
        System.out.println(avg);
    }
}
