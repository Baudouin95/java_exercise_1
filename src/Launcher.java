import java.util.Scanner;
public class Launcher {

    public static void main(String[] args) {
        System.out.println("Bienvenue !!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String str = sc.nextLine();

        if(str == "quit"){

        } else {
            System.out.println("Unknown command");
        }
    }
}
