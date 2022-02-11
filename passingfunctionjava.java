public class passingfunctionjava {

    public static void main(String[] args) {
        int[] nums= {3,4,5,12};
        System.out.println(nums);
        change(nums);
        System.out.println(nums);
    }


            //arrays have mutable behaviour, strings are immutable

    static void change(int[] arr)
    {
        arr[0]= 99;
    }
}
