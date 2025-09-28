public class Student {
    //Creating a new data type.
    public static class Stud{
        String name;
        int rno;
        double percent;
    }
    public static void main(String args[]){
        Stud x = new Stud(); //Declaration
        x.name="Ved";      //|
        x.rno=56;          //|->Initialization
        x.percent=56.6;    //|

        System.out.println(x.name);
    }
}
