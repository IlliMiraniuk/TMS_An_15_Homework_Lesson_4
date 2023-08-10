import java.util.Random;
import java.util.Scanner;

public class Exercise0 {
    public static void main(String[] args) {
        final int c = 10;
        int[] array = new int[c];
        int zakop = 0;

        for (int z = 0; z < c; z++)
            array[z] = new Random().nextInt(10);

        System.out.print("Enter number : ");

        try{
            zakop = new Scanner(System.in).nextInt();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (int element: array)
            if (zakop == element){
                System.out.println("He is here!");
                return;
            }

        System.out.println("Error");
    }
}

