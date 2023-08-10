import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array from five to ten: ");
        boolean bool = true;
        int dlin1 = 0;
        while (bool) {
            dlin1 = scanner.nextInt();
            if (dlin1 >= 5 && dlin1 <= 10) {
                bool = false;
            } else {
                System.out.println("Invalid number");
                System.out.print("Try again please: ");
            }
        }
        double[] arrayOne = new double[dlin1];
        System.out.println("Enter numbers");
        for (int z = 0; z < arrayOne.length; z++) {
            double number = scanner.nextDouble();
            arrayOne[z] = number;
        }
        int dlin2 = 0;
        for (double x : arrayOne) {
            if (x % 2 == 0) {
                dlin2++;
            }
        }
        int z = 0;
        double[] arrayTwo = new double[dlin2];
        for (double x : arrayOne) {
            if (x % 2 == 0) {
                arrayTwo[z] = x;
                z++;
            }
        }
        System.out.println("Initial array: " + Arrays.toString(arrayOne));
        System.out.println("Array with even numbers: " + Arrays.toString(arrayTwo));
    }
}
