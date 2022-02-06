import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter your roll number: ");
        int roll_no= input.nextInt();

        System.out.println("Your roll number is: " + roll_no);
    }
}
