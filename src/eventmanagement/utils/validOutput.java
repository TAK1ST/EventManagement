package eventmanagement.utils;

import java.util.Scanner;

package eventmanagement.utils;

public class ValidOutput {

    // Method to get a trimmed and lowercased string from Scanner
    public static String getTrimmedLowercaseString(Scanner sc) {
        return sc.nextLine().trim().toLowerCase();
    }

    // Method to clear the console screen
    public static void clearScreen() {
        // This method is meant for console applications
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    // Method to pad a string with spaces to a specified length
    public static String padSpaces(String value, int length) {
        return String.format("%-" + length + "s", value);
    }
}
