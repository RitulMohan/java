import java.util.Arrays;
import java.util.Scanner;

public class inp {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 451;
//        arr[3] = 452;
//        arr[4] = 453;

        //System.out.println(arr[3]);


        //input using for loops

//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= in.nextInt();
//        }
//
////        for (int j : arr) { //for every element in the array print the element
////            System.out.print(j + " ");
////        }
//
//        System.out.println(Arrays.toString(arr));


        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
                str[i]= in.next();
        }


        System.out.println(Arrays.toString(str));


    }
}
