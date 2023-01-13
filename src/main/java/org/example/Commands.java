package org.example;

import java.util.Scanner;

public class Commands {
    Scanner scanner = new Scanner(System.in);

    public void playerCard() {
        String userInput = "";
        boolean loop = true;

        while (loop) {
            userInput = scanner.nextLine();
            if (!userInput.isEmpty()) {
                System.out.println("Please press Enter:");
            } else {
                loop = false;
            }
        }
    }



}
