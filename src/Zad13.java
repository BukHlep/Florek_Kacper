import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        int calories=300/4;
        int cookies;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile zjadłeś ciastek: ");
        cookies = scan.nextInt();
        System.out.println("To jest "+calories*cookies+" kalorii");
    }
}
