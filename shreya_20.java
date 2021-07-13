import java.util.Scanner;
import java.util.Random;
public class shreya_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 0 to 2");
        int num = sc.nextInt();
        //rock=0
        //scissor=1
        //paper=2
        Random random = new Random();
        int compNum= random.nextInt(3);
        System.out.println("a random int from 0 to 2:"+compNum);
        if (compNum==0 && num==1) {
            System.out.println("you lose");
        }
        else if (compNum==0 && num==2) {
            System.out.println("You win");
        }
        else if (compNum==1 && num==2) {
            System.out.println("sorry");
        }
        else if (compNum==1 && num==0) {
            System.out.println("wohoo");
        }
        else if (compNum==2 && num==0) {
            System.out.println("well played");
        }
        else if (compNum==2 && num==1) {
            System.out.println("better luck next time");
        }
        else {
            System.out.println("It's a tie!");
        }





    }
}
