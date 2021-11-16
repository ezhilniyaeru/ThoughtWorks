import java.util.*;


public class DoraGraden {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int toFind=sc.nextInt();
        if(toFind<=row || toFind%col==1 ||toFind%col==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");

        }

    }
}
