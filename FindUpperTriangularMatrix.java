import java.util.Scanner;

public class FindUpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rowSize = scan.nextInt();
        int colSize = scan.nextInt();
        int[][] arr = new int[rowSize][colSize];
        int forwardDiagonal = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = rowSize - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i][j] == 0) {
                    forwardDiagonal = 0;
                } else {
                    forwardDiagonal = 1;
                    break;
                }
            }
            if (forwardDiagonal == 1) {
                break;
            }

        }
        if (forwardDiagonal == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
