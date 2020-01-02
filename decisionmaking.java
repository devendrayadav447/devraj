package dev;

public class decisionmaking {


    public static void main(String[] args)
    {

        ifelsedemo();
        nestedifdemo();
        ifelseifdemo();
        switchcasedemo();





    }

    public static void ifelsedemo()
    {
        int i = 10;

        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");
    }


    public static void nestedifdemo() {
        int j = 10;

        if (j == 10) {
            // First if statement
            if (j < 15)
                System.out.println("j is smaller than 15");

            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (j < 12)
                System.out.println("j is smaller than 12 too");
            else
                System.out.println("j is greater than 15");
        }
    }

        public static void ifelseifdemo()
        {

            int k = 20;

            if (k == 10)
                System.out.println("k is 10");
            else if (k == 15)
                System.out.println("k is 15");
            else if (k == 20)
                System.out.println("k is 20");
            else
                System.out.println("k is not present");




        }
        public static void switchcasedemo()
        {
            int i = 9;
            switch (i)
            {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                default:
                    System.out.println("i is greater than 2.");
            }






        }









}
