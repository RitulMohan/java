public class searchin2D_ls {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6, 67, 24, 98},
                {6,7,8, 65, 12},
                {13, 17}
        };

        int target = 13;
        System.out.println(search( arr, target));
    }

     static boolean search(int[][] arr, int target) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j <arr[i].length ; j++) {
                    if(arr[i][j]==target)
                    {
                        return true;
                    }
             }

         }
         return false;
    }

}
