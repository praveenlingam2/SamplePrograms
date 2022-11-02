package Programs;

import java.util.Scanner;

public class Vowels {
    public static boolean isVowels(char ch){
    String str="aeiouAEIOU";
    if(str.contains(ch+"")){
        return true;
    }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String p=sc.nextLine();
//        char [] arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(isVowels(str.charAt(i))){
                System.out.print(str.charAt(i)+p);
            }
            else
            {
                System.out.print(str.charAt(i));
            }
        }

    }
}
