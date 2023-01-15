package org.example;

import java.util.Scanner;

public class Commands {
    Scanner scanner = new Scanner(System.in);

    // method, which prompts the user to press enter and waits for an input

    public void playerCard() {
        // if the length is not zero that means the user has typed something and loop continues
        // until enter is pressed
        // if it 0 then the user has pressed enter
        while(scanner.nextLine().length() != 0) {
            System.out.println("Please press Enter:");
        }
    }



}
