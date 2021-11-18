import java.util.Scanner;

public class FindLowerTriangularMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rowSize = scan.nextInt();
        int colSize = scan.nextInt();
        int[][] arr = new int[rowSize][colSize];
        int diagonal = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < rowSize; i++) {

            for (int j = i + 1; j < colSize; j++) {

                if (arr[i][j] == 0) {
                    diagonal = 0;
                } else {
                    diagonal = 1;
                    break;
                }
            }
            if (diagonal == 1) {
                break;
            }

        }
        if (diagonal == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
