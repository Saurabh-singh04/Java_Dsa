import java.util.Scanner;

public class NumberToWords {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 0) {
            return "Negative " + convertToWords(-number);
        }

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        }

        if (number < 1000) {
            return units[number / 100] + " Hundred " + convertToWords(number % 100);
        }

        if (number < 1_000_000) {
            return convertToWords(number / 1000) + " Thousand " + convertToWords(number % 1000);
        }

        if (number < 1_000_000_000) {
            return convertToWords(number / 1_000_000) + " Million " + convertToWords(number % 1_000_000);
        }

        return "Number too large to convert";
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number");
     int number = sc.nextInt();
        String words = convertToWords(number);
        System.out.println(number + " in words: " + words);
    }
}


