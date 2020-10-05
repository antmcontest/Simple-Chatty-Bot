import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean isLessThan10 = false;
        int newInt = scanner.nextInt();
        if(newInt < 10){
            isLessThan10 = true;

        }
        System.out.println(isLessThan10);
    }
}