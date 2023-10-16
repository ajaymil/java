package main.java.s;

import java.util.Scanner;

public class NUMWORD  {
    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        if (num < 0) {
            return "Negative " + numberToWords(-num);
        }
        return convertToWords(num);
    }

    private static String convertToWords(int num) {
        if (num < 10) {
            return ones[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + ones[num % 10];
        } else if (num < 1000) {
            return ones[num / 100] + " Hundred " + convertToWords(num % 100);
        } else if (num < 1000000) {
            return convertToWords(num / 1000) + " Thousand " + convertToWords(num % 1000);
        } else if (num < 1000000000) {
            return convertToWords(num / 1000000) + " Million " + convertToWords(num % 1000000);
        } else {
            return convertToWords(num / 1000000000) + " Billion " + convertToWords(num % 1000000000);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        String result = numberToWords(number);
        System.out.println("In words: " + result);
    }
}
