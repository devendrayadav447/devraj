package dev;
//code to understand the scope and use case of variable
public class variable { static int age = 0;
    public static void StudentAge()
    {
        // local variable age
        
        age = age + 5;
        System.out.println("Student age is : " + age);
    }

    public static void main(String args[])
    {

        StudentAge();
       // System.out.println("Student age is : " + age);  if we access the local variable from outside the block of function student age
    }
}
