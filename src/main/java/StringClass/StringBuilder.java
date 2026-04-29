//package StringClass;
//
//public class StringBuilder {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1000; i++) {
//            sb.append(i);        // modifies existing object — fast! ⚡
//        }
//        String result = sb.toString();
//
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("Hello");          // adds to end
//        sb.append(" World");          // "Hello World"
//        sb.insert(0, "Say: ");        // insert at index → "Say: Hello World"
//        sb.reverse();                 // "dlroW olleH :yaS"
//        sb.delete(0, 5);              // remove [0, 5)
//        sb.replace(0, 5, "Hi");       // replace [0, 5) with "Hi"
//        sb.length();                  // current length
//        sb.toString();                // convert back to String
//
//    }
//}
