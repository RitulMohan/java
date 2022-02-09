import java.util.Scanner;

public class inputLargest {
    public static void main(String[] args) {
        double even = 0, odd = 0, sum = 0;
        int counter = 0, input = 0, large = Integer.MIN_VALUE, small = Integer.MAX_VALUE;


        System.out.println("Enter a series of values (0 to quit): ");

        Scanner in = new Scanner(System.in);
        while((input = in.nextInt()) != 0)
        {
            small = Integer.min(small, input);
            large = Integer.max(large, input);
            sum += input;
            counter++;

            if (input % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        if(counter > 0)
        {
            double average = sum / counter;
            System.out.println("The smallest integer is: " + small);
            System.out.println("The largest integer is: " + large);
            System.out.println("Total number of integers entered is " + counter);
            System.out.println("Total even numbers entered is " + even);
            System.out.println("Total odd numbers entered is " + odd);
            System.out.println("The average value is: " + average);
        }
        else
        {
            System.out.println("No data was entered.");
        }


    }

}
