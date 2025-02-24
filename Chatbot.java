import java.util.Scanner;;

public class Chatbot {
    public static void main(String[] args) {
        String botName = "Anu";
        int yearBorn = 2025;

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + yearBorn + ".");

        Scanner sc = new Scanner(System.in);

        // Next allows us to capture keyboard input, even numbers. But it converts
        // everything to a string.
        String name = sc.next();
        // If you want to print a compound string (one with spaces) you have to invoke a
        // new next. Next only reads characters up to a space.
        String lname = sc.next();
        System.out.println("Hello, " + name + " " + lname);

        sc.close();

    }
}