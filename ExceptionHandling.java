
import java.util.Scanner;
import java.lang.Exception;

public class ExceptionHandling {

    static void solve(int arr[]) throws Exception {
        int ans = 0;

        for (int i = 0; i < 10; i++)
            for (int j = i + 1; j < 10; j++)
                ans += arr[i] / arr[j];
        throw new MyException(ans);
    }

    public static void main(String args[]) throws Exception {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            in.nextLine();

            for (int i = 0; i < 10; i++)
                arr[i] = Integer.parseInt(in.nextLine());

            String s = in.nextLine();
            System.out.println(s.charAt(10));
            solve(arr);
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        } catch (MyException e) {
            System.out.println(e);
        } finally {
            System.out.println("Exception Handling Completed");
        }
    }
}

class MyException extends Exception {
    private final int except;

    MyException(int a) {
        except = a;
    }

    public String toString() {
        return "MyException[" + except + "]";
    }
}
