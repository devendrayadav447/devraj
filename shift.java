package dev;

public class shift {
    public static void main(String args[])
    {
        leftshift();
        rightshift();

    }


    public static void leftshift()
    {
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240
         System.out.println(-5>>3);



    }


    public static void rightshift()
    {
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2



    }
}
