import java.util.Arrays;

public class peak_in_mountain {

    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr){
        int start =0;
        int end= arr.length -1;


        while(start< end){
                int mid = start +  (end - start)/2;
                if(arr[mid] > arr[mid+1]){ //you are in the decreasing part of the array
                    end = mid;
                } else {  //as mid+1 is greater than mid
                    start= mid + 1;
                }
            }
        //when start == end, checks over
            return start; //start = equal return any of the two

    }
}
