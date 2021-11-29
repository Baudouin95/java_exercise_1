import java.util.Scanner;
public class Launcher {

    public static void main(String[] args) {
        System.out.println("Bienvenue !!!");

        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while(a)
        {
            System.out.println("Veuillez saisir un mot : ");
            String str = sc.nextLine();
            if(str.equals("quit")){
                break;
            }
            else {
                System.out.println("Unknown command");
                System.out.println("Veuillez saisir un mot : ");
            }
        }
    }
}
