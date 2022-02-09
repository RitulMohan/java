public class arguments {

    public static void main(String[] args) {


        String personal= mygreet("ritul");
//int ans =sum(10,10);
//
//
//    }
//
//    static int sum(int  a, int b)
//    {
//        int sum= a+b;
//        return sum;
//    }

        String message= greet();
        System.out.println(message);
    }

    private static String mygreet(String name) {

        String message =  ("hello"+ name);
        return message;
    }

    static String  greet(){
        String greeting= "how are you";
        return greeting;

    }
}
