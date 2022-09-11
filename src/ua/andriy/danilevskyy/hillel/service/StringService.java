package ua.andriy.danilevskyy.hillel.service;

public class StringService {
    /**
     * The Method verifies and returns the number that equals to number of specific characters containing in Text.
     *
     * @param text String value (any text).
     * @param c    char value to search in the text.
     * @return returns int value of specific characters containing in the text.
     */
    public int findSymbolOccurance(String text, char c) {
        if (text != null && c != 0) {
            int count = 0;
            char[] arr = text.toCharArray();
            for (char item : arr) {
                if (item == c) {
                    count++;
                }
            }
            return count;
        } else {
            System.out.println("One or both args are null or incorrect.");
            return -1;
        }
    }

    /**
     * The method searches the target value in the source value. If target found the method returns index of the first
     * target's char in source or returns '-1' in case when the target value is not found in the source.
     *
     * @param source String value to search in
     * @param target String value searching in source
     * @return int index of the first char of the target value found in source or returns '-1' in case when the
     * target value is not found in the source.
     */
    public int findWordPosition(String source, String target) {
        if (source != null && target != null) {
            return source.indexOf(target);
        } else {
            System.out.println("One or both args are null.");
            return -1;
        }
    }

    /**
     * The method reverses input text
     *
     * @param text String value for reversing
     * @return String reversed text
     */
    public String stringReverse(String text) {
        if (text != null) {
            return new StringBuilder(text).reverse().toString();
        } else {
            System.out.println("The argument is null.");
            return null;
        }
    }

    /**
     * Method verifies if the input String is palindrome.
     *
     * @param value is a String value
     * @return boolean if the String value is palindrome.
     */
    public Boolean isPalindrome(String value) {
        if (value != null) {
            String reversedValue = stringReverse(value);
            return value.equals(reversedValue);
        } else {
            System.out.println("The argument is null");
            return null;
        }
    }
}
