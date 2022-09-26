import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class flower {
    public static int[] funcBouquet(int[] flowerStick, int random) {
        int[] answer = new int[flowerStick.length];
        Arrays.sort(flowerStick);
        int j=0;
        for(int i=0;i<flowerStick.length;i++){
            if(i>=0 && i<random){
                answer[i]=flowerStick[i];
            }
            else {
              answer[i]=flowerStick[flowerStick.length-1-j++];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flowerStick_size = in.nextInt();
        int flowerStick[] = new int[flowerStick_size];
        for (int idx = 0; idx < flowerStick_size; idx++)
        {
            flowerStick[idx] = in.nextInt();
        }
        int random = in.nextInt();
        flower obj=new flower();
        int[] temp=obj.funcBouquet( flowerStick, random);
        for(int j=0;j<flowerStick.length;j++){
            System.out.print(temp[j]+" ");
        }
}
}


