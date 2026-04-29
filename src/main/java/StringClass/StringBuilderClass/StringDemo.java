package StringClass.StringBuilderClass;

public class StringDemo {
    public static void main(String[] args) {
        String email = "  Alice.Smith@Example.COM  ";

        // Clean it up
        email = email.trim().toLowerCase();
        System.out.println("Cleaned: " + email);          // "alice.smith@example.com"

        // Validate
        if (!email.contains("@")) {
            System.out.println("Invalid email!");
            return;
        }

        // Extract parts
        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];

        System.out.println("Username: " + username);       // "alice.smith"
        System.out.println("Domain: " + domain);            // "example.com"

        // Replace dot with space in name
        String displayName = username.replace(".", " ");
        System.out.println("Display: " + displayName);      // "alice smith"

        // Capitalize first letter of each word
        String[] nameParts = displayName.split(" ");
        StringBuilder result = new StringBuilder();
        for (String part : nameParts) {
            char first = Character.toUpperCase(part.charAt(0));
            String rest = part.substring(1);
            result.append(first).append(rest).append(" ");
        }
        System.out.println("Final: " + result.toString().trim());   // "Alice Smith"
    }
}