import java.util.Scanner;

public class Quit implements Command {

    @Override
    public boolean run(Scanner sc) {
        return false;
    }

    @Override
    public String name() {
        return null;
    }
}
