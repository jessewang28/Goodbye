package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Goodbye");
        //double x = Math.random();
        //double x = Math.random()*10;    //random double (0.0,10.0)
        //int x = (int) (Math.random()*10); //random integer between (0.0, 10)
        int x = (int) (Math.random()*10) + 10; //random integer between (10.0, 20.0)
                                                // (int) (Math.random() * a +b  --> "a" numbers starting at b
        //Random Numbers Assignment:
        int a = (int) (Math.random() * 11);
        int b = (int) (Math.random() * 6+1);
        int c = (int) (Math.random() * 2);
        int d = (int) ((Math.random() * 6 +1) + (Math.random() * 6+1));
        int e = (int) (Math.random() * 36 +65);
        double f = (double) (Math.random() * 9 +1);

       // System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
