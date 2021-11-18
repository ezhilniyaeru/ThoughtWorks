import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sequenceRange = scan.nextInt();
        System.out.print(sequenceRange + " ");
        while (sequenceRange > 1) {

            if (sequenceRange % 2 == 0) {
                sequenceRange = sequenceRange / 2;

            } else {
                sequenceRange = (3 * sequenceRange) + 1;
            }
            System.out.print(sequenceRange + " ");
        }
    }
}
