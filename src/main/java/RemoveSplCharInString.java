import java.util.Scanner;

public class RemoveSplCharInString {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            String str=s.trim();
            if(str.length() == 0)
            {
                System.out.println(0);
                System.exit(0);
            }
            String[] strarr=str.split("[!,?._' @ ]+");
            System.out.println(strarr.length);
            for(int i=0;i<strarr.length;i++){
                System.out.println(strarr[i]);

        }
    }
}
