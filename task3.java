import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI Chatbot ===");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("name")) {
                System.out.println("Bot: I am a Java AI Chatbot.");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am doing great. Thanks for asking!");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a popular object-oriented programming language.");
            }
            else if (input.contains("internship")) {
                System.out.println("Bot: An internship helps you gain practical experience.");
            }
            else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }

        sc.close();
    }
}
