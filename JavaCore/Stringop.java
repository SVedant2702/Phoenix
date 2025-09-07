public class Stringop{
    public static void main(String args[]){
        String str1="Hello Java";
        //characterat that index
        char res1=str1.charAt(4);
        System.out.println("character at index 4 is:"+res1);

        //compare lexicographically
        String str2="hello java";
        int res2=str1.compareTo(str2);
        int res3=str1.compareToIgnoreCase(str2);
        System.out.println("For simple comparison: "+res2+" Ignore Case: "+res3);

        boolean res4=str1.equals(str2);
        boolean res5=str1.equalsIgnoreCase(str2);
        System.out.println("THIS IS BOOLEAN COMPARISON\nFor simple comparison: "+res4+" Ignore Case: "+res5);
    }
}