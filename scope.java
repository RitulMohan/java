public class scope {


    public static void main(String[] args) {
        int a= 10;
        int b=20;


        //System.out.println(c);
        //error : block scope block ke bahar variable ko access nhi kar skte

        {

            //what is initialised in the block, stays in the block
            //int a=78; ERROR
            //you can not initialise 'a' again, you can only modify it
             a=78;
             int c= 99;
        }



        //scoping in for loops
        for(int i = 0; i < 5; i++) {
            //this 'i' is not accessible outside the for loop

        }
    }
}
