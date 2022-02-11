import java.util.Scanner;

public class prob {


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();

        prime(n);
    }

    static void prime(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not prime");;
            }

        }

    }

}
