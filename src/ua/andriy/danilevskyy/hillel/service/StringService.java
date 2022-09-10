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
        int count = 0;
        char[] arr = text.toCharArray();
        for (char item : arr) {
            if (item == c) {
                count++;
            }
        }
        return count;
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
        return source.indexOf(target);
    }

    /**
     * The method reverses input text
     *
     * @param text String value for reversing
     * @return String reversed text
     */
    public String stringReverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    /**
     * Method verifies if the input String is palindrome.
     *
     * @param value is a String value
     * @return boolean if the String value is palindrome.
     */
    public boolean isPalindrome(String value) {
        String str = value.toLowerCase();
        int i;
        int j = str.length() - 1;
        for (i = 0; i < j; ) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
