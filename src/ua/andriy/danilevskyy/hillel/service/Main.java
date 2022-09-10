package ua.andriy.danilevskyy.hillel.service;

public class Main {
    public static void main(String[] args) {
        StringService service = new StringService();

        // task 2
        System.out.println(service.findSymbolOccurance("Hello world", 'o'));

        //task 3
        System.out.println(service.findWordPosition(
                "Hello world",
                "o")); // task 3

        //task 4
        System.out.println(service.stringReverse("dlrow olleH"));

        //task 5
        System.out.println(service.isPalindrome("ololo"));
    }
}
