public class sumofdigits {


    public static void main(String[] args) {
        int n=123;

        int remain=0;
        int prod= 1;

         while(n>0)
         {
             prod=prod*n%10;
             remain=remain+n%10;
             n=n/10;

         }
int diff= prod - remain;
        System.out.print(remain+" ");
        System.out.println(prod);
        System.out.println(diff);
    }
}
