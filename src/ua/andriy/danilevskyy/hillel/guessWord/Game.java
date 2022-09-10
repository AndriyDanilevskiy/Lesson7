package ua.andriy.danilevskyy.hillel.guessWord;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public void start(String[] wordList) {
        String hiddenWord = wordList[new Random().nextInt(wordList.length)];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, guess the hidden word");

        boolean isWordFound = false;
        String input;
        for (int i = 1; i <= hiddenWord.length(); i++) {
            input = scanner.nextLine();
            if (!input.equals(hiddenWord)) {
                StringBuilder openedWord = new StringBuilder(hiddenWord).delete(i, hiddenWord.length());
                if (i == hiddenWord.length()) {
                    System.out.println("The word is " + openedWord);
                } else {
                    System.out.println("Wrong, try again!");
                    System.out.println("The word is " + openedWord.append("###############").substring(0,15));
                }
            } else {
                isWordFound = true;
                break;
            }
        }
        if (isWordFound) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
