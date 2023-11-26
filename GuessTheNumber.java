package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max=100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    ;
    
    public void Play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your Number is too big");
            } else if (move < theNumber) {
                System.out.println("Your Number is too small");
            } else {
                System.out.println("Your got itt yaaaay");
                break;
            }
        }
    }

    ;
    

    public static void howBigIsMuNymber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is large");
        }

    }

    ;
    
    public static void main(String[] args) {
        // TODO code application logic here
        GuessTheNumber guessGame = new GuessTheNumber();
        guessGame.Play();
    }

}
