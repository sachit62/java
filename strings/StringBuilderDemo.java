public class StringBuilderDemo {
    public static void main(String[] args) {
        // 1️⃣ Create a new StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial: " + sb);

        // 2️⃣ Append text (any type)
        sb.append(" World");  // Adds " World" at the end
        System.out.println("After append: " + sb);

        // 3️⃣ Insert text at a specific index
        sb.insert(5, ",");   // Inserts ',' at index 5
        System.out.println("After insert: " + sb);

        // 4️⃣ Replace a substring
        sb.replace(0, 5, "Hey"); // Replace characters from index 0 to 4 with "Hey"
        System.out.println("After replace: " + sb);

        // 5️⃣ Delete a substring
        sb.delete(3, 5); // Deletes characters from index 3 to 4
        System.out.println("After delete: " + sb);

        // 6️⃣ Delete a single character
        sb.deleteCharAt(2); // Deletes character at index 2
        System.out.println("After deleteCharAt: " + sb);

        // 7️⃣ Reverse the entire StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 8️⃣ Access a character at a specific index
        char ch = sb.charAt(0); // Get character at index 0
        System.out.println("Character at index 0: " + ch);

        // 9️⃣ Set a character at a specific index
        sb.setCharAt(0, 'D'); // Replace character at index 0 with 'D'
        System.out.println("After setCharAt: " + sb);

        // 🔟 Get length of StringBuilder
        System.out.println("Length: " + sb.length());

        // 1️⃣1️⃣ Get capacity (internal buffer size)
        System.out.println("Capacity: " + sb.capacity());

        // 1️⃣2️⃣ Ensure minimum capacity
        sb.ensureCapacity(50); // Increase capacity to at least 50
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 1️⃣3️⃣ Extract substring
        String sub1 = sb.substring(2);      // From index 2 to end
        String sub2 = sb.substring(2, 5);   // From index 2 to 4
        System.out.println("Substring from index 2: " + sub1);
        System.out.println("Substring from index 2 to 4: " + sub2);

        // 1️⃣4️⃣ Convert to String
        String finalString = sb.toString();
        System.out.println("toString: " + finalString);

        // 1️⃣5️⃣ Index of a substring
        int index1 = sb.indexOf("Wo");       // First occurrence
        int index2 = sb.lastIndexOf("o");    // Last occurrence
        System.out.println("indexOf(\"Wo\"): " + index1);
        System.out.println("lastIndexOf(\"o\"): " + index2);

        // 1️⃣6️⃣ Trim capacity to current length
        sb.trimToSize();
        System.out.println("Capacity after trimToSize: " + sb.capacity());
    }
}
