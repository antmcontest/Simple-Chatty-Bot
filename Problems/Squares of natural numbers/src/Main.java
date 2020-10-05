import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 1;
        while (start <= n){
            double x = Math.pow(start, 2);
            System.out.println(x);
            start++;

        }

    }
}