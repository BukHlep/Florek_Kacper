import java.util.Scanner;

public class If9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double weight, distance, times, total;
        int times2;
        System.out.println("Ile waży twoja paczka: ");
        weight = scan.nextInt();
        System.out.println("Ile km paczka przebedzie: ");
        distance = scan.nextInt();
        times = distance/500;
        times2 = (int)Math.ceil(times);
        if (weight<=1){
            total = times2*1.10;
        } else if(weight>1 && weight <=3) {
            total = times2*2.20;
        } else if(weight>3 && weight <=5) {
            total = times2*3.70;
        } else {
            total = times2*3.80;
        }
        System.out.println("Koszt przesyłki wyniesie: "+total+"zł");
    }
}
