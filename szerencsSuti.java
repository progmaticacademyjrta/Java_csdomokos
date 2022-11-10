
import java.util.Scanner;

public class szerencsSuti {
    public static void main(String[] args) {

        System.out.println("Szia! Kapni fogsz egy jó kívánságot!");
        System.out.println("Adj egy számot 1től 5ig");
        Scanner scanner = new Scanner(System.in);
        int userChoose = scanner.nextInt();


        if (userChoose == 1){
            System.out.println("A hétvége után csak az első 5 nap nehéz.");
        }
        else if(userChoose == 2){
            System.out.println("Ne aggódj, a lejjebbnél mindig van feljebb.");
        }
        else if(userChoose == 3){
            System.out.println("Lesz ez meg így se s úgy is jó lesz.");
        }
        else if(userChoose == 4){
            System.out.println("Soha ne add fel. Lagzi Lajcsi is megúszta a börtönt.");
        } else if(userChoose == 5){
            System.out.println("Berki is meg tudott gazdagodni, neked is sikerülhet.");
        }else{
            System.out.println("Kérlek válassz egy számot 1 és 5 között!");
        }
    }


}
