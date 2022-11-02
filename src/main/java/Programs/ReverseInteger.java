package Programs;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m=n;
        int temp=0;
        if(n<10){
            System.out.println(0);
            System.exit(0);
        }
        while (n>0){
          temp=(temp*10)+n%10;
          n=n/10;
        }
        System.out.println(temp);
        System.out.println(temp-m);
    }
}
