import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args){
        double start, percent, times, years, total, total2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile wynosiła kwota początkowa: ");
        start = scan.nextInt();
        System.out.println("Ile wynosiła roczna stopa oprocentowania: ");
        percent = scan.nextInt();
        System.out.println("Ile razy w roku odsetki są liczone: ");
        times = scan.nextInt();
        System.out.println("Ile lat: ");
        years = scan.nextInt();
        double podstawa = (1+0.01*percent/times);
        double wykladnik = times*years;
        total = Math.pow(podstawa, wykladnik);
        total2 = start*total;
        System.out.println("Obecnie masz: "+total2);
    }
}
