import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int width,height;
        System.out.println("Podaj wymiar pierwszy: ");
        width = scan.nextInt();
        System.out.println("Podaj wymiar drugi: ");
        height = scan.nextInt();
        int room1=width*height;
        System.out.println("Podaj wymiar pierwszy: ");
        width = scan.nextInt();
        System.out.println("Podaj wymiar drugi: ");
        height = scan.nextInt();
        int room2=width*height;
        System.out.println("Podaj wymiar pierwszy: ");
        width = scan.nextInt();
        System.out.println("Podaj wymiar drugi: ");
        height = scan.nextInt();
        int room3=width*height;
        int total=2*room1+room2+room3;
        System.out.println("Pokoje mają powierzchnie: "+room1+"m^2, "+room1+"m^2, "+room2+"m^2, "+room3+"m^2; a powierzchnia mieszkania ma: "+total+"m^2");
    }
}