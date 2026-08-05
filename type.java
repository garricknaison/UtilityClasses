package UtilityClasses;

public class type {
    public static void writer(String message) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            time.pause(60);
        }
        System.out.println();
    }
}
