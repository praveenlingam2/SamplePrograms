package Programs;

import java.util.Scanner;

public class StingContains {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        if(str.contains("http://") || str.contains("ftp://") || str.contains("https://")) {
            System.out.println(str+"");
        }
        else if (str.contains(".")) {
            System.out.println("http://"+str);
        }
        else {
            System.out.println("ftp://"+str);
        }
    }
}
