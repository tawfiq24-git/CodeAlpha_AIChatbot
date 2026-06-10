package aichatbot;
import java.util.Scanner;
import java.time.LocalTime;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;
        String userName = "";

        System.out.println("====================================");
        System.out.println("        ADVANCED AI CHATBOT");
        System.out.println("====================================");
        System.out.println("Type 'bye' to exit.");
        System.out.println("Type 'help' to see commands.\n");

        while(true) {

            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            // Greeting
            if(userInput.equals("hello") || userInput.equals("hi")) {

                System.out.println("Bot: Hello! What is your name?");

                System.out.print("Enter your name: ");
                userName = sc.nextLine();

                System.out.println("Bot: Nice to meet you, " + userName + "!");

            }

            // How are you
            else if(userInput.equals("how are you")) {

                System.out.println("Bot: I am doing great!");

            }

            // Name
            else if(userInput.equals("what is your name")) {

                System.out.println("Bot: I am an Advanced Java AI Chatbot.");

            }

            // Time feature
            else if(userInput.equals("time")) {

                LocalTime currentTime = LocalTime.now();

                System.out.println("Bot: Current Time is: " + currentTime);

            }

            // Joke feature
            else if(userInput.equals("tell me a joke")) {

                System.out.println("Bot: Why do programmers prefer dark mode?");
                System.out.println("Bot: Because light attracts bugs!");

            }

            // Calculator feature
            else if(userInput.equals("calculator")) {

                int a, b;

                System.out.print("Enter first number: ");
                a = sc.nextInt();

                System.out.print("Enter second number: ");
                b = sc.nextInt();

                int sum = a + b;

                System.out.println("Bot: Sum = " + sum);

                sc.nextLine();
            }

            // Help menu
            else if(userInput.equals("help")) {

                System.out.println("\nAvailable Commands:");
                System.out.println("hello");
                System.out.println("how are you");
                System.out.println("what is your name");
                System.out.println("time");
                System.out.println("tell me a joke");
                System.out.println("calculator");
                System.out.println("bye");

            }

            // Exit
            else if(userInput.equals("bye")) {

                System.out.println("Bot: Goodbye " + userName + "! Have a nice day.");
                break;

            }

            // Unknown input
            else {

                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}