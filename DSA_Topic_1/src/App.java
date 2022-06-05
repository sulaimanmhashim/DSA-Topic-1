import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Greb Application!");
        options();
    }
    private static void options() {
        Scanner s = new Scanner(System.in);
        System.out.println("Options:\nA - View System Dashboard\nB - Enter Customer View\nC - Add/Remove Driver\nZ - Exit");
        char n = s.nextLine().charAt(0);
        if (n=='a'||n=='A') {
            System.out.println(n);
            //go to class/method
        } else if (n=='b'||n=='B') {
            System.out.println(n);
            //go to class/method
        } else if (n=='c'||n=='C') {
            System.out.println(n);
            //go to class/method
        } else if (n=='z'||n=='Z'){
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Error, input unavailable. Please try again.");
            options();
        } s.close();
    }
}
