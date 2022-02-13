

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistex {

    //arraylist in java is similar to vectors in C++
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        //you can't use int^ here, we have to use a wrapper class and not primitives

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);

        System.out.println(list);

        list.set(0,99);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            list.get(i);
        }
    }




}

