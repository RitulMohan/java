public class evendigits {
   // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
int[] nums= {12,345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int  findNumbers(int[] nums){
        int count = 0;
        for( int num: nums)
        {
            if(even(num)){
                count ++;
            }
        }

        
        return count;
    }

     static boolean even(int num) {
                int number_digits= digits(num);
         //if length of string is divisible by 2 number is even
//         if(number_digits%2 == 0){
//             return true;
//
//         }
//         return false;

         return number_digits%2 == 0;

    }


    static int digits(int num){

        if(num<0){
            num = num*(-1);
        }


        int count = 0;
        while(num>0){
            num= num/10;
            count ++;

        }

        return count;
    }

    static int digits2(int num){
        return (int)(Math.log10(num))+1 ;
    }

}
