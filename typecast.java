import java.util.Scanner;

public class typecast {
    public static void main(String[] args) {

//        Scanner input= new Scanner(System.in);
//        float num= input.nextFloat();

        int num= (int)(69.69);

//        byte b=50;
//        b=b*2;
//        System.out.println(b);

        byte b=42;
        char c= 'a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1223;
        double result = (f*b)+ (i/c)- (d-s);
        //float + int - double
        System.out.println(result);
    }
}
