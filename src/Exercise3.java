import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array1 = new double[5];
        System.out.print("Enter array: ");
        for (int z = 0; z < array1.length; z++) {
            System.out.print("Enter " + (z + 1) + " element: ");
            double krop = scanner.nextDouble();
            array1[z] =krop;
        }
        double[] array2 = new double[5];
        System.out.print("Enter array: ");
        for (int z = 0; z < array2.length; z++) {
            System.out.print("Enter " + (z + 1) + " element: ");
            double zakop = scanner.nextDouble();
            array2[z] = zakop;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        double cat1 = 0;
        double cat2 = 0;
        for (double x : array1) {
            cat1 += x;
        }
        for (double c : array2) {
            cat2 += c;
        }
        double average1 = cat1 / 5;
        double average2 = cat2 / 5;
        System.out.println("Average value of the array one: " + average1);
        System.out.println("------------------------");
        System.out.println("Average value of the array two: " + average2);
        System.out.println("------------------------");
        if (average1 > average2) {
            System.out.println("The average value of the array 1 is greater then 2");
        } else if (average2 > average1) {
            System.out.println("The average value of the array 2 is greater then 1");
        } else {
            System.out.println("The average are");
        }
    }
}

