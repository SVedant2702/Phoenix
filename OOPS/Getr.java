public class Getr {

    public String name;
    private int rno;

    // Constructor
    public Getr(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }

    // Getter method for rno
    public int getRno() {
        return rno;
    }

    // Static nested class (not really necessary here, but included if needed)
    public static class Nclass {
        public int getRnoFromObject(Getr obj) {
            return obj.rno;  // Accessing private field through object
        }
    }

    public static void main(String[] args) {
        Getr s = new Getr("John", 101);  // Creating object with values
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.getRno());

        // Using nested class to get roll number
        Nclass n = new Nclass();
        System.out.println("Roll No (via Nclass): " + n.getRnoFromObject(s));
    }
}
