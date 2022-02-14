public class two_sumArr {
//leetcode problem
    public static void main(String[] args) {
        int[] arr={ 1,12,13,14,15};
        int target= 16;
        two_sum(arr, target);
    }

    static void two_sum(int[] arr, int target){
//       int o =0;
//        int start= arr[o];

        for (int i = 0; i <arr.length ; i++) {
            int o =0;
            if( arr[o] + arr[i]== target){
                System.out.println(o+" "+i);
            }
            else{
                o++;
            }
        }

    }
}
