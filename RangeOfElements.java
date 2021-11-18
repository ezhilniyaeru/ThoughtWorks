import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RangeOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int minNum = Collections.min(Arrays.asList(arr));
        int maxNum = Collections.max(Arrays.asList(arr));
        System.out.println(maxNum - minNum);
    }
}

