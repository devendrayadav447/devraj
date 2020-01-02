package dev.oop;

 class cube {
    
    
    int length ;
    int breadth ;
    int height ;
    public int getvolume()
    {
        return (length*breadth*height);
    }

    cube()
    {

        //System.out.println("we are in cubes");
        length=10;
        breadth=20;
        height=10;


    }
    cube(int l,int b, int h)
    {

        //System.out.println("we are in cubes");
        length=l;
        breadth=b;
        height=h;


    }

}


public class constructor {
    public static void main(String args[])
    {
        cube Cube=new cube();
        cube cube2=new cube(10,20,30);//constructor overloading
    }
}
