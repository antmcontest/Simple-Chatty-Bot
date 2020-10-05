import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int largest = 0;

        do {
            int input = scanner.nextInt();
            if (input == 0){
                break;
            }
            if (input > largest) {
                largest = input;
            }

        } while (scanner.hasNext());

        System.out.println(largest);
    }
}