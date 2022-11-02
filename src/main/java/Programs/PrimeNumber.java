package Programs;

public class PrimeNumber {
    public static void main(String[] args) {
        for(int n=15;n<=200;n++) {

            int flag = 0;
            if (n == 0 || n == 1)
                System.out.println("NPN");
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(n+" is Prime Number");
            }
        }
    }
}
