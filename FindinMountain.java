public class FindinMountain {

    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int firsttry=orderagnosticBS(arr, target, 0, peak);
        if(firsttry != -1){
            return firsttry;
        }
        return orderagnosticBS(arr, target,peak+1, arr.length-1);
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

    static int orderagnosticBS ( int[] arr, int target, int start, int end){


        //find whether the array is sorted in ascending or descending
//         boolean isAsc;
//         if (arr[start]< arr[end]){
//              isAsc = true;
//         }else{
//             isAsc = false;
//         }

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // find middle element
            // int mid = start + end/2;
//might be the case that start+ end can exceed the integer range in java
            int mid = start +  (end - start)/2; //which is actually start + end/2 only if you look at it

            if(arr[mid]== target){
                return mid;
            }


            if (isAsc) {
                if(target < arr[mid]){
                    end = mid -1;
                } else if(target > arr[mid]){
                    start= mid + 1;
                }
            }else{
                if (target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }


            }


        }
        return -1;
    }

}
