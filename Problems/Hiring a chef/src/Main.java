//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String age = scanner.next();
        String education = scanner.next();
        String yearsExp = scanner.next();
        String pref = scanner.next();

        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + pref + " dishes.");
    }
}