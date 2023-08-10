import java.util.Arrays;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        final int z = 100;
        int[] array = getArray(z);

        System.out.println("Initial array = " + Arrays.toString(array));
        changeArray(array);
        System.out.println("Even array = " + Arrays.toString(array));
    }

    private static void changeArray(int[] a){
        for (int x = 1; x < a.length; x += 2)
            a[x] = 0;
    }

    private static int[] getArray(int size){
        int[] a = new int[size];

        for (int x = 0; x < size; x++)
            a[x] = new Random().nextInt(100);

        return a;
    }
}

