import java.util.Scanner;

public class hellow {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner2.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}
