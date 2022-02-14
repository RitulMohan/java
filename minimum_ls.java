import java.util.Arrays;

public class minimum_ls {

    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min2(arr));
    }

    private static int min2(int[] arr) {
        int mini=arr[0];
        for (int i = 0; i <arr.length ; i++) {
                if(mini > arr[i])
                {
                    mini = arr[i];
                }
        }
        return mini;
    }

    static int min(int[] arr) {
         Arrays.sort(arr);
         return arr[0];
    }

}
