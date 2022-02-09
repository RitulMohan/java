import java.util.Scanner;

public class input0 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int input = 0;
    int counter =0;
    int sum=0;

        {
            System.out.println("enter the numbers (0 to quit) : ");
            while((input = inp.nextInt()) != 0)
            {
                inp.nextInt();
                counter ++;
            }

            for (int i = 0; i <counter; i++) {
                sum=sum+input;
            }
        }
    }
}
