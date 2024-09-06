package guess;

import java.util.Scanner;

public class Guess {

    int number(){
        System.out.println("guess.Guess a number between 0 and 99");
        return new Scanner(System.in).nextInt();
    }
    // int x = new guess.Guess().number();
}