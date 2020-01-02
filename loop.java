package dev;

public class loop {
    public static void main(String[] args)
    {

        forloop();
        foreachloop();
        labeledforloop();
        whileloop();
        dowhileloop();


    }

    public static void forloop()
    {
        //loop of i
        for(int i=1;i<=3;i++){
            //loop of j
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }//end of i
        }//end of j
    }

    public static void foreachloop()
    {
        int arr[]={12,23,44,56,78};
        //Printing array using for-each loop
        for(int i:arr){
            System.out.println(i);
        }


    }


    public static void labeledforloop()
    {
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }



    }

    public static void whileloop()
    {
        int x = 1;

        // Exit when x becomes greater than 4
        while (x <= 4)
        {
            System.out.println("Value of x:" + x);

            // Increment the value of x for
            // next iteration
            x++;
        }
    }


    public static void dowhileloop()
    {
        int x = 21;
        do
        {
            // The line will be printed even
            // if the condition is false
            System.out.println("Value of x:" + x);
            x++;
        }
        while (x < 20);


    }

}
