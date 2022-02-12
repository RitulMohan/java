import java.util.Arrays;
import java.util.Scanner;

public class multidim {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
//        int[][] arr =new int[3][];
////imagine multidim arrays as an array of arrays
//
//        int[][] arr = {
//                {1,2,3}, //0 index
//                {4,5},      //1st index
//                {6,7,8,9}       //2nd index
//        };
        int[][] arr = new int[3][3];
        System.out.println(arr.length); //gives the number of rows
        //input
        for (int i = 0; i < arr.length; i++) {
            //for every column
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }

//            for (int[] ints : arr) {
//                //for every column
//                for (int j = 0; j < ints.length; j++) {
//                    System.out.print(ints[j] + " ");
//                }
//                System.out.println();
//
//            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


    }

    }

