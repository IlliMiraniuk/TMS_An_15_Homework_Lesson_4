import java.util.Scanner;

public class Exercise1  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose size: ");
        int sn = scanner.nextInt();
        int[] array = new int[sn];
        for (int z = 0; z < array.length; z++) {
            System.out.print("Enter " + (z + 1) + " element: ");
            int num = scanner.nextInt();
            array[z] = num;
        }
        System.out.print("Enter number to delete: ");
        int number = scanner.nextInt();
        boolean bool = false;
        for (int z = 0; z < array.length; z++) {
            if (array[z] == number) {
                for (; z < array.length - 1; z++) {
                    array[z] = array[z + 1];
                }
                bool = true;
                break;
            }
        }
        if (bool) {
            System.out.print("Complete: [ ");
            for (int z = 0; z < array.length - 1; z++) {
                System.out.print(array[z] + " ");
            }
            System.out.println("]");
        } else {
            System.out.println("Error");
        }
    }
}

