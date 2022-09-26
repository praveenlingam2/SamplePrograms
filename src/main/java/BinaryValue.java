import java.util.Scanner;

public class BinaryValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int flag=0;
        String result = Integer.toBinaryString(a);
        String a1 = String.format("%8s", result).replaceAll(" ", "0");
        System.out.println(a1);
        String results = Integer.toBinaryString(b);
        String b1 = String.format("%8s", results).replaceAll(" ", "0");
        System.out.println(b1);
        int minLen = Math.min(a1.length(),b1.length());
        for (int i = 0 ; i != minLen ; i++) {
            char chaA=a1.charAt(i);
            char chaB=b1.charAt(i);
            if(chaA!=chaB){
                flag++;
            }
        }
        System.out.println(flag);
    }
}
