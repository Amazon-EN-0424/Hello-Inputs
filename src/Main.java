import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello stranger! ;) Please input your name:"); // prompting the user
        Scanner scanner = new Scanner(System.in); // creating a Scanner that will capture the user input
        String name = scanner.nextLine(); // capturing the user input
        System.out.println("Hello " + name); // using the input we captured in a sout
    }
}