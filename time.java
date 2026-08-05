package UtilityClasses;

public class time {
    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("An error has occurred.");
        }
    }

}
