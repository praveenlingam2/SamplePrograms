import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int m=arr[i];
            while (m>0){
                sum=sum+m%10;
                m=m/10;
            }
            arr[i]=sum;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
