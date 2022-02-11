import java.util.Scanner;

public class angstrom3 {


    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        //boolean ans= isangstrom(n);
        //System.out.println(ans);

        System.out.println(isangstrom(n));
    }

    static boolean isangstrom(int n)
    {
        int orignal = n;
        int sum =0;


        while(n>0)
        {
            int rem= n% 10;
            n=n/10;
            sum+=(rem*rem*rem);

        }


        return sum == orignal;

    }

}
