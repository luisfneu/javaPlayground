import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read user input

        System.out.println("Hello, " + name + "! Welcome to Java.");  // Output greeting
    }
}
