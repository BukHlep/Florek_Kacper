import java.util.Scanner;

public class If13 {
    public static void main(String[] args){
        String pakiet;
        double pozostale, koszt, koszt2, koszt3, minuty, zaokraglenie, roznica;
        Scanner scan = new Scanner(System.in);
        System.out.println("Który pakiet? ");
        pakiet = scan.nextLine();
        System.out.println("Ile minut rozmawiales: ");
        minuty = scan.nextInt();
        if (pakiet.equalsIgnoreCase("A")) {
            pozostale = minuty - 450;
            if (pozostale<0){
                System.out.println("39.99zł do zapłaty");
            } else {
                koszt = 39.99+(minuty-450)*0.45;
                zaokraglenie = (double)Math.round(koszt*100)/100;
                System.out.println(zaokraglenie+"zł do zapłaty");
                if(koszt>59.99){
                    pozostale = minuty - 900;
                    if(pozostale>=0) {
                        koszt2 = 59.99 + (minuty - 900)*0.4;
                        roznica = koszt - koszt2;
                        System.out.println("zaoszczędziłbyś "+roznica+"zł mając pakiet B");
                    } else {
                        roznica = koszt - 59.99;
                        System.out.println("zaoszczędziłbyś "+roznica+"zł mając pakiet B");
                    }
                if (koszt>69.99){
                    roznica = koszt - 69.99;
                    System.out.println("zaoszczędziłbyś "+roznica+"zł mając pakiet C");
                }
                }
            }
        } else if (pakiet.equalsIgnoreCase("B")) {
            pozostale = minuty - 900;
        } else if (pakiet.equalsIgnoreCase("C")) {

        } else {
            System.out.println("Zepsułeś");
        }

    }
}
