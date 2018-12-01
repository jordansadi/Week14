package ch13.work.template;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUser extends BookReader {
    private Scanner k = new Scanner(System.in);
    private ArrayList<String> inputs = new ArrayList<>();
    private boolean more = true;

    @Override
    void initialize() {
        while (more) {
            System.out.println("Enter a line:");
            String userInput = k.nextLine();
            inputs.add(userInput);

            System.out.println("Continue? (Yes/No):");
            userInput = k.nextLine();

            if (userInput.toLowerCase().equals("no"))
                more = false;
        }
    }

    @Override
    void startReading() {
        for (String s : inputs)
            System.out.println(s);
    }

    @Override
    boolean isInteractive() {
        return true;
    }

    @Override
    void stopReading() {
        System.out.println("All user input has been displayed.");
    }
}
