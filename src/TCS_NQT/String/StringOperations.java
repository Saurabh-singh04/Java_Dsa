//package TCS_NQT.String;
//import java.util.Scanner;
//
//public class StringOperations {
//
//    // Check if a string is palindrome
//    public static boolean isPalindrome(String str) {
//        int n = str.length();
//        for (int i = 0; i < n / 2; i++) {
//            if (str.charAt(i) != str.charAt(n - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // Count vowels, consonants, and spaces
//    public static void countVowelsConsonantsSpaces(String str) {
//        int vowels = 0, consonants = 0, whitespaces = 0;
//        str = str.toLowerCase(); // converting given string to lowercase
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//                vowels++;
//            else if (ch >= 'a' && ch <= 'z')
//                consonants++;
//            else if (ch == ' ')
//                whitespaces++;
//        }
//
//        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants + ", Spaces: " + spaces);
//    }
//
//    // Find ASCII value of a character
//    public static int asciiValue(char c) {
//        return (int) c;
//    }
//
//    // Remove all vowels from the string
//    public static String removeVowels(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if ("aeiouAEIOU".indexOf(c) == -1) {
//                result += c;
//            }
//        }
//        return result;
//    }
//
//    // Remove spaces from a string
//    public static String removeSpaces(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' ') {
//                result += str.charAt(i);
//            }
//        }
//        return result;
//    }
//
//    // Remove characters except alphabets
//    public static String removeNonAlphabets(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
//                result += str.charAt(i);
//            }
//        }
//        return result;
//    }
//
//    // Reverse a string
//    public static String reverseString(String str) {
//        String result = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            result += str.charAt(i);
//        }
//        return result;
//    }
//
//    // Remove brackets from an algebraic expression
//    public static String removeBrackets(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c != '(' && c != ')' && c != '{' && c != '}' && c != '[' && c != ']') {
//                result += c;
//            }
//        }
//        return result;
//    }
//
//    // Sum of numbers in a string
//    public static int sumOfNumbers(String str) {
//        int sum = 0, num = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (Character.isDigit(c)) {
//                num = num * 10 + (c - '0');
//            } else {
//                sum += num;
//                num = 0;
//            }
//        }
//        return sum + num;
//    }
//
//    // Capitalize first and last character of each word
//    public static String capitalizeFirstLast(String str) {
//        String result = "";
//        str = " " + str.trim() + " ";
//        for (int i = 1; i < str.length() - 1; i++) {
//            if (str.charAt(i - 1) == ' ' && str.charAt(i + 1) != ' ') {
//                result += Character.toUpperCase(str.charAt(i));
//            } else if (str.charAt(i + 1) == ' ' && str.charAt(i - 1) != ' ') {
//                result += Character.toUpperCase(str.charAt(i));
//            } else {
//                result += str.charAt(i);
//            }
//        }
//        return result.trim();
//    }
//
//    // Find frequency of characters in a string
//    public static void frequencyOfCharacters(String str) {
//        for (char c = 'a'; c <= 'z'; c++) {
//            int count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (Character.toLowerCase(str.charAt(i)) == c) {
//                    count++;
//                }
//            }
//            if (count > 0) {
//                System.out.println(c + ": " + count);
//            }
//        }
//    }
//
//    // Find non-repeating characters in a string
//    public static void nonRepeatingCharacters(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (str.indexOf(c) == str.lastIndexOf(c)) {
//                System.out.print(c + " ");
//            }
//        }
//        System.out.println();
//    }
//
//    // Check if two strings are anagram of each other
//    public static boolean isAnagram(String str1, String str2) {
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//        if (str1.length() != str2.length()) return false;
//        for (char c = 'a'; c <= 'z'; c++) {
//            int count1 = 0, count2 = 0;
//            for (int i = 0; i < str1.length(); i++) {
//                if (str1.charAt(i) == c) count1++;
//                if (str2.charAt(i) == c) count2++;
//            }
//            if (count1 != count2) return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Check if a string is palindrome
//        System.out.print("Enter a string to check if it's a palindrome: ");
//        String str = scanner.nextLine();
//        System.out.println("Is Palindrome: " + StringOperations.isPalindrome(str));
//
//        // Count vowels, consonants, and spaces
//        System.out.println("Enter a string to count vowels, consonants, and spaces: ");
//        String input = scanner.nextLine();
//        StringOperations.countVowelsConsonantsSpaces(input);
//
//        // Find ASCII value of a character
//        System.out.print("Enter a character to find its ASCII value: ");
//        char c = scanner.next().charAt(0);
//        System.out.println("ASCII value: " + StringOperations.asciiValue(c));
//        scanner.nextLine(); // Clear buffer
//
//        // Remove all vowels from the string
//        System.out.print("Enter a string to remove vowels: ");
//        String noVowels = scanner.nextLine();
//        System.out.println("String without vowels: " + StringOperations.removeVowels(noVowels));
//
//        // Remove spaces from a string
//        System.out.print("Enter a string to remove spaces: ");
//        String noSpaces = scanner.nextLine();
//        System.out.println("String without spaces: " + StringOperations.removeSpaces(noSpaces));
//
//        // Remove characters except alphabets
//        System.out.print("Enter a string to remove non-alphabetic characters: ");
//        String onlyAlphabets = scanner.nextLine();
//        System.out.println("String with only alphabets: " + StringOperations.removeNonAlphabets(onlyAlphabets));
//
//        // Reverse a string
//        System.out.print("Enter a string to reverse: ");
//        String reversed = scanner.nextLine();
//        System.out.println("Reversed String: " + StringOperations.reverseString(reversed));
//
//        // Remove brackets from an algebraic expression
//        System.out.print("Enter an algebraic expression to remove brackets: ");
//        String expression = scanner.nextLine();
//        System.out.println("Expression without brackets: " + StringOperations.removeBrackets(expression));
//
//        // Sum of numbers in a string
//        System.out.print("Enter a string to calculate the sum of numbers: ");
//        String withNumbers = scanner.nextLine();
//        System.out.println("Sum of numbers in string: " + StringOperations.sumOfNumbers(withNumbers));
//
//        // Capitalize first and last character of each word
//        System.out.print("Enter a string to capitalize first and last character of each word: ");
//        String capitalize = scanner.nextLine();
//        System.out.println("Capitalized String: " + StringOperations.capitalizeFirstLast(capitalize));
//
//        // Find frequency of characters in a string
//        System.out.print("Enter a string to find character frequencies: ");
//        String freqString = scanner.nextLine();
//        System.out.println("Character Frequencies:");
//        StringOperations.frequencyOfCharacters(freqString);
//
//        // Find non-repeating characters in a string
//        System.out.print("Enter a string to find non-repeating characters: ");
//        String nonRepeating = scanner.nextLine();
//        System.out.print("Non-repeating characters: ");
//        StringOperations.nonRepeatingCharacters(nonRepeating);
//
//        // Check if two strings are anagrams
//        System.out.print("Enter first string to check for anagram: ");
//        String str1 = scanner.nextLine();
//        System.out.print("Enter second string to check for anagram: ");
//        String str2 = scanner.nextLine();
//        System.out.println("Are Anagrams: " + StringOperations.isAnagram(str1, str2));
//    }
//
//        // Remaining tasks can be implemented similarly...
//}
