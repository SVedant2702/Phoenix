public class Stringop2 {
    public static void main(String args[]){
        String str1="Hello Java";
        int res1=str1.length();
        System.out.println("Length of String: "+res1);

        //Contains
        boolean res2=str1.contains("Java");
        System.out.println("String Contains Java: "+res2);
    }
}
