import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            throw new Exeption("Exeption");
        } catch (Exeption e) {
            System.out.println(e.getMessage());
        }
    }

    static class Exeption extends Exception {
        public Exeption(String message) {
            super(message);
        }

    }
}