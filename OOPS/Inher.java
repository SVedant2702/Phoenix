class Shape{
    String color;
}
class Triangle extends Shape{
    void printcolor(){
    System.out.println(color);
}
}
public class Inher {
    public static void main(String args[]){
        Triangle t = new Triangle();
        t.color="red";
        t.printcolor();
    }
}
