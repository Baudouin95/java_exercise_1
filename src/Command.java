import java.util.Scanner;

public interface Command {

    public boolean run(Scanner sc);
    public String name();

}
