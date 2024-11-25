public class StringOperations {
    // compare to two strings
    public static void CompareOfStrings(String s1, String s2) {
        System.out.println("The comparison of the strings : ");
        int x = s1.compareTo(s2);
        if (x != 0) {
            System.out.println(s1 + " is not equal to " + s2);
            if (x > 0) {
                System.out.println(s1 + " is greater than " + s2);
            } else {
                System.out.println(s2 + " is greater than " + s1);
            }
        } else {
            System.out.println(s1 + " is equal to " + s2);
        }
    }

    // concatinate of two strings
    public static void concatString(String s1, String s2) {
        System.out.println();
        System.out.println("Concatenation of the strings : ");
        System.out.println(s1.concat(s2));
    }

    // length of string
    public static void lengthOfString(String s) {
        System.out.println();
        System.out.print("Length of the string "+s+" is :");
        System.out.print(s.length());
    }

    public static void main(String[] args) {
        
        CompareOfStrings("Hi","Hello"); 
        concatString("Hello ","I'm Himanshu kumar"); 
        lengthOfString("Himanshu kumar");
    }
}