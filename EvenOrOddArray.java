import java.util.Scanner;

public class EvenOrOddArray {
    static int FindEvenOrOddArray(int[] array, int size) {
        int even = 0, odd = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        if (even == size) {
            return 1;
        } else if (odd == size) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(FindEvenOrOddArray(arr, size));
    }
}
