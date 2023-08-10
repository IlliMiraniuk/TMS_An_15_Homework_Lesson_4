import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[] dop = {12, 23, 34, 16, 77};
        boolean isSorted = false;
        int cel;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < dop.length - 1; i++) {
                if (dop[i] > dop[i + 1]) {
                    isSorted = false;
                    cel = dop[i];
                    dop[i] = dop[i + 1];
                    dop[i + 1] = cel;
                }
            }
        }
        System.out.println(Arrays.toString(dop));
    }
}

