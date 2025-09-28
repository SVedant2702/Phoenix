class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}
class Triangle extends Shape{
    public void area(double l, double h){
    System.out.println(0.5*l*h);
}
}
public class Sinher{
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.area(1.0,1.0);
    }
}