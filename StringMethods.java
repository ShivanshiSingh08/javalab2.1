import java.util.*;
public class StringMethods {

    public static void main(String[] args) {
        String text = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative";

        // charAt()
        char firstCharacter = text.charAt(0);
        System.out.println("First character: " + firstCharacter);
          System.out.println("\n");
          System.out.println("\n");
        // compareTo()
        int comparison = text.compareTo("surrounding villages");
        System.out.println("Comparison result: " + comparison);
 System.out.println("\n");
          System.out.println("\n");
        // concat()
        String combinedString = text.concat(" The alternative mentioned here is the Tata Nano");
        System.out.println("Combined string: " + combinedString);
 System.out.println("\n");
          System.out.println("\n");
        // contains()
        boolean containsWord = text.contains("suffering");
        System.out.println("Does the text contain 'suffering': " + containsWord);
 System.out.println("\n");
          System.out.println("\n");
        // endsWith()
        boolean endsWithWord = text.endsWith("an alternative");
        System.out.println("Does the text end with 'an alternative': " + endsWithWord);
 System.out.println("\n");
          System.out.println("\n");
        // equals()
        boolean isEqual = text.equals("surrounding villages");
        System.out.println("Is the text equal to 'surrounding villages': " + isEqual);
 System.out.println("\n");
          System.out.println("\n");
        // equalsIgnoreCase()
        boolean isEqualIgnoringCase = text.equalsIgnoreCase("surrounding villages");
        System.out.println("Is the text equal to 'surrounding villages' (ignoring case): " + isEqualIgnoringCase);
 System.out.println("\n");
          System.out.println("\n");
        // format()
        String formattedString = String.format("The text contains %d characters", text.length());
        System.out.println("Formatted string: " + formattedString);
 System.out.println("\n");
          System.out.println("\n");
        // getBytes()
        byte[] bytes = text.getBytes();
        System.out.println("Byte representation of the text: " + Arrays.toString(bytes));
 System.out.println("\n");
          System.out.println("\n");
        // getChars()
        char[] chars = new char[text.length()];
        text.getChars(0, text.length(), chars, 0);
        System.out.println("Character array representation of the text: " + Arrays.toString(chars));
 System.out.println("\n");
          System.out.println("\n");
        // indexOf()
        int index = text.indexOf("quality");
        System.out.println("First index of 'quality': " + index);
 System.out.println("\n");
          System.out.println("\n");
        // intern()
        String internedString = text.intern();
        System.out.println("Interned string: " + internedString);
 System.out.println("\n");
          System.out.println("\n");
        // isEmpty()
        boolean isEmpty = text.isEmpty();
        System.out.println("Is the text empty: " + isEmpty);
 System.out.println("\n");
          System.out.println("\n");
        // join()
        String joinedString = String.join(" ", "We", "realizes", "that");
        System.out.println("Joined string: " + joinedString);
 System.out.println("\n");
          System.out.println("\n");
        // lastIndexOf()
        int lastIndex = text.lastIndexOf("suffering");
        System.out.println("Last index of 'suffering': " + lastIndex);
 System.out.println("\n");
          System.out.println("\n");
        // length()
        int length = text.length();
        System.out.println("Length of the text: " + length);
 System.out.println("\n");
          System.out.println("\n");
        // replace()
        String replacedString = text.replace("I", "We");
        System.out.println("String with 'I' replaced by 'We': " + replacedString);
 System.out.println("\n");
          System.out.println("\n");
        // replaceAll()
        String replacedAllString = text.replaceAll("workers", "employees");
        System.out.println("String with all occurrences of 'workers' replaced by 'employees': " + replacedAllString);
 System.out.println("\n");
          System.out.println("\n");
        // split()
        String[] words = text.split(" ");
        System.out.println("Array of words: " + Arrays.toString(words));
 System.out.println("\n");
          System.out.println("\n");
        // startsWith()
        boolean startsWithWord = text.startsWith("We");
        System.out.println("Does the text start with 'We': " + startsWithWord);
 System.out.println("\n");
          System.out.println("\n");
        // substring()
        String substring = text.substring(10, 25);
        System.out.println("Substring from index 10 to 25: " + substring);
 System.out.println("\n");
          System.out.println("\n");
        // toCharArray()
        char[] charArray = text.toCharArray();
        System.out.println("Character array representation of the text: " + Arrays.toString(charArray));
 System.out.println("\n");
          System.out.println("\n");
        // toLowerCase()
        String lowercaseString = text.toLowerCase();
        System.out.println("Lowercased string: " + lowercaseString);
 System.out.println("\n");
          System.out.println("\n");
        // toUpperCase()
        String uppercaseString = text.toUpperCase();
        System.out.println("Uppercased string: " + uppercaseString);
 System.out.println("\n");
          System.out.println("\n");
        // trim()
        String trimmedString = "    leading and trailing spaces    ".trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");
 System.out.println("\n");
          System.out.println("\n");
        // valueOf()
        int value = 42;
        String valueOfString = String.valueOf(value);
        System.out.println("String value of int: \n" + valueOfString);
         System.out.println("\n");
          System.out.println("\n");
 }
}