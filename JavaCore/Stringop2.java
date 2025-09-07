public class Stringop2 {
    public static void main(String args[]){
        String str1="Hello Java";
        int res1=str1.length();
        System.out.println("Length of String: "+res1);

        //Contains
        boolean res2=str1.contains("Java");
        System.out.println("String Contains Java: "+res2);
        
        //Startswith and Endswith
        boolean res3=str1.startsWith("Hello");
        System.out.println("String Startswith : "+res3);
        boolean res4=str1.endsWith("Hello");
        System.out.println("String Startswith : "+res4);
    }
}
