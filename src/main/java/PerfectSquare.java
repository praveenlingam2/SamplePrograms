import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int flag=0;
        int [] n=new int[number];
        for(int i=0;i<number;i++) {
            n[i] = scanner.nextInt();
            for (int j = 1; j <=n[i]/2; j++) {
                if (j * j == n[i]) {
                    flag++;
                }
            }
        }
        System.out.println(flag);
    }
}

