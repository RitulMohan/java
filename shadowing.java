public class shadowing {


    static  int x=90;
    //this x is available for all scopes and blocks
    //but will be shadowed by x in line 10
    // the lower level overrides the upper level

    public static void main(String[] args) {

//scope begins after variable is initialised

        int x=80;
        System.out.println(x);

        fun();


    }

     static void fun() {
         System.out.println(x);
    }
}
