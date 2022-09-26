import java.util.Scanner;

public class BinaryValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), flag = 0;
        String result = Integer.toBinaryString(a);
        String a1 = String.format("%8s", result).replaceAll(" ", "0");
        System.out.println(a1);
        String results = Integer.toBinaryString(b);
        String b1 = String.format("%8s", results).replaceAll(" ", "0");
        System.out.println(b1);
        char[] arrA = a1.toCharArray();
        char[] arrB = b1.toCharArray();
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                flag++;
            }
        }
        System.out.println(flag);
    }
}
