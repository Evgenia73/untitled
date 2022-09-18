import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner console = new Scanner(System.in);
            String name = console.nextLine();
            if (name.equals("help")){
                System.out.println("Да");
            }
            else if (name.equals("Привет"))
                System.out.println("Привет!");
            else
                System.out.println("Введите правильную команду");
        }
    }
}