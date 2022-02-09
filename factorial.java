import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        int fact=1;
        System.out.println("Enter the number you want to calculate: ");
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();

        for (int i = 1; i <= n ; i++) {
            fact=fact*i;
        }

        System.out.println(fact);

    }
}
