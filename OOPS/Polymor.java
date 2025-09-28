class Studnt{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}

public class Polymor {
    public static void main(String args[]){
        Studnt s= new Studnt();
        s.name = "Vedb";
        s.age=24;

        s.printInfo(s.age);
    }
}
