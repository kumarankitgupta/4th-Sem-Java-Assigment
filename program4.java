import java.util.Scanner;

interface shape{
     void area();
}
class circle implements shape{
    int r;
    void getdimension(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Radius of circle : ");
        r  = sc.nextInt();
    }
    @Override
    public void area(){
        System.out.println("Area is "+Math.PI*Math.pow(r, 2)+" unit Sq.");
    }
}
class triangle implements shape{
    int b , h;
    void getdimension(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Base of Triangle : ");
        b = sc.nextInt();
        System.out.print("enter the Height of Triangle : ");
        h = sc.nextInt();
    }
    @Override
    public void area() {
        System.out.println("Area is " +0.5 * b * h +" unit Sq.");
    }
    
}
public class program4 {
    public static void main(String[] args) {
        triangle t = new triangle();
        t.getdimension();
        t.area();

        circle c = new circle();
        c.getdimension();
        c.area();
    }
}
