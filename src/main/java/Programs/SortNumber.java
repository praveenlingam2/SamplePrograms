package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        char[]arr=str.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
