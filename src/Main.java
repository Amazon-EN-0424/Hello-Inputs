import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
//        ctrl + / in order to comment out a single o multiple selected lines
//
//        System.out.println("Hello stranger! ;) Please input your name:"); // prompting the user
//        Scanner myScanner = new Scanner(System.in); // creating a Scanner that will capture the user input
//        String name = myScanner.nextLine(); // capturing the user input
//        System.out.println("Hello " + name); // using the input we captured in a sout
//        System.out.printf("What you favorite number %s?\n", name);
//        int favoriteNumber = myScanner.nextInt();
//        if (favoriteNumber == 42) {
//            System.out.println("Oh, I like your ANSWER");
//        } else if(favoriteNumber == 13) {
//            System.out.println("Scary.....");
//        } else if (favoriteNumber == 1) {
//            System.out.println("and your least favorite number?");
//            int leastFavoriteNumber = myScanner.nextInt();
//            System.out.println("oh poor " + leastFavoriteNumber );
//        } else {
//            System.out.println("Nice, thanks");
//        }
//        myScanner.close();


        String fileName = "my_todo_list.txt";
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file, true);




        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME to YOUR personal COMMAND LINE ASSISTANT: ");
        System.out.println("Please enter a valid command:");
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("exit")) {
            System.out.println("You selected command " + command);
            if (command.equalsIgnoreCase("read")) {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()){
                    System.out.println(fileScanner.nextLine());
                }
            } else if (command.equalsIgnoreCase("write")){
                Scanner fileScanner = new Scanner(file);
                System.out.println("What you want to add to the todolist?");
                String toWrite = scanner.nextLine();
                fileWriter.write(toWrite);

                fileWriter.close();

            }

            System.out.println("What you want to do now?");
            command = scanner.nextLine();
        }
        Logger logger = new Logger();
        logger.log("Exiting");
        Thread.sleep(150);

        System.exit(0);
    }
}