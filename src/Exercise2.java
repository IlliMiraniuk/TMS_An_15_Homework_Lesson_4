import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose size: ");
        int krop = scanner.nextInt();
        double[] array = new double[krop];
        for (int z = 0; z < array.length; z++) {
            array[z] = Math.random();
        }
        System.out.println(Arrays.toString(array));
        double max = array[0], min = array[0];
        for (int z = 0; z < array.length - 1; z++) {
            if (max < array[z + 1]) {
                max = array[z + 1];
            }
            if (min > array[z + 1]) {
                min = array[z + 1];
            }
        }
        double average = (max + min) / 2;
        System.out.println("Minimum value: " + min + "\nAverage value: " + average + "\nMaximum value: " + max);
    }
}

