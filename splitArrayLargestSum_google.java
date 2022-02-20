public class splitArrayLargestSum_google {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start= 0;
        int end =0;

        for (int i = 0; i < nums.length ; i++) {
            //start will be te maximum item of the arrays
            //in the end of the loop this will contain the max element of the array
            start = Math.max(start, nums[i]);
            end += nums[i];

        }


        while(start < end){
            //try for the middle as the potential answer
           int mid = start + (end - start)/2;

           //how many pieces with this max sum
           int sum = 0;
           int pieces =1;

           for(int num: nums){
               if(sum+ num>mid){
                   //you cant add this sub array add a new one
                   //say you add this num in the new subarray, then sum = num
                   sum = num;
                   pieces ++ ;
               }else{
                   sum +=num;
               }

            }
           if (pieces > m){
               start = mid +1;
           }else{
               end = mid;
           }

        }
        return end; //here starr == end
    }

}
