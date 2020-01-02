
class Emp {

    // static variable salary
    public static double salary;
    public static String name = "Aniket";
}
public class staticvar {
    public static void main(String args[])
    {

        // accessing static variable without object
        //To access static variables, we need not create an object of that class, we can simply access the variable as
        //class_name.variable_name;
        Emp.salary = 1000;
        System.out.println(Emp.name + "'s average salary:"
                + Emp.salary);
    }

}
