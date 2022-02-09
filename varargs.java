import java.util.Arrays;

public class varargs {

    public static void main(String[] args) {

        fun(2,3,4,44,55,6,6,7,7,8,34,3,5,6,54,243,5,455347);

    }

    static void fun(int a, int b, int ...v){
//...v is internally taking it as an array of integers
        //variable length parameter always in the end

        System.out.println(Arrays.toString(v));
    }

}
