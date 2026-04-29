package StringClass;

public class string1 {
    public static void main(String[] args) {
        String s1 ="Hello";
        s1= s1+" World";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.contains("Hello"));
        System.out.println(s1.contains("World"));
        System.out.println(s1.toUpperCase());
        char c = s1.charAt(0);
        System.out.println(c);
        System.out.println(s1.substring(7));
        System.out.println(s1.substring(0,7));

        String s2 = "Hello";
        String s3 = "hello";

        System.out.println(s2.equals(s3));                // false (case-sensitive)
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2 == s3);

//        String s = "Hello, World!";
//
//        System.out.println(s.contains("World"));           // true
//        System.out.println(s.contains("world"));           // false (case-sensitive)
//        System.out.println(s.contains("xyz"));

        String s = "Hello, Hello!";
        System.out.println(s.indexOf("Hello"));             // 0 (first occurrence)
        System.out.println(s.lastIndexOf("Hello"));         // 7 (last occurrence)
        System.out.println(s.indexOf("World"));             // -1 (not found)
        System.out.println(s.indexOf('o'));                 // 4 (first 'o')

        String s4 = "Hello, World!";

        System.out.println(s4.replace('l', 'X'));            // "HeXXo, WorXd!"
        System.out.println(s4.replace("World", "Java"));     // "Hello, Java!"
        System.out.println(s4.replace("xyz", "abc"));

        String s5 = " Hello, xorld! ";
        System.out.println(s5.trim());  // "Hello" (spaces removed from both ends)

        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");

        String s6 = "Hello, ";
        String s7 = "World!";

        String result = s6.concat(s7);  // "Hello, World!"
        System.out.println(result);
        String result2 = s1 + s2;// "Hello, World!" (more common)

//        "".isEmpty();                   // true
//        "hello".isEmpty();              // false
//        "   ".isEmpty();                // false (has spaces!)
//        "   ".isBlank();                // true (Java 11+ — spaces count as blank)

//        String s = "Hello, World!";
//
//        s.startsWith("Hello");          // true
//        s.startsWith("World");          // false
//        s.endsWith("World!");           // true
//        s.endsWith("!");                // true

//        String s = "Hello";
//        char[] chars = s.toCharArray();
//// chars = ['H', 'e', 'l', 'l', 'o']
//
//        for (char c : chars) {
//            System.out.println(c);
//        }

//
//        // Number → String
//        String s1 = String.valueOf(42);          // "42"
//        String s2 = String.valueOf(3.14);        // "3.14"
//        String s3 = String.valueOf(true);        // "true"
//        String s4 = "" + 42;                     // "42" (shortcut)
//
//// String → Number
//        int n = Integer.parseInt("42");          // 42
//        double d = Double.parseDouble("3.14");   // 3.14
//// Integer.parseInt("abc");              // ❌ NumberFormatException




    }
}
