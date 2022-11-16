import java.util.Random;
import java.util.Scanner;

public class koPapirOllo_shortVersion {
    public static void main(String[] args) {
        String computerChooseString = null;
        Random randomGenerator = new Random();
        int computerChoose = randomGenerator.nextInt(3);

        switch (computerChoose) {
            case 0 -> computerChooseString = "kő";
            case 1 -> computerChooseString = "papír";
            case 2 -> computerChooseString = "olló";
        }

        System.out.println("Válasszon kő, papír és olló közül!");
        Scanner scanner = new Scanner(System.in);
        String userChoose = scanner.nextLine();

        if (userChoose.equals(computerChooseString)) {
            System.out.println("Mindkét fél a " + userChoose + "-t választotta.");
        } else if (userChoose.equals("kő") && computerChooseString.equals("olló")) {
            System.out.println("Te nyertél a " + userChoose + " választásával.  " + "A gép választása " + computerChooseString + " volt.");
        } else if (userChoose.equals("olló") && computerChooseString.equals("papír")) {
            System.out.println("Te nyertél a " + userChoose + " választásával.  " + "A gép választása " + computerChooseString + " volt.");
        } else if (userChoose.equals("papír") && computerChooseString.equals("kő")) {
            System.out.println("Te nyertél a " + userChoose + " választásával. " + "A gép választása " + computerChooseString + " volt.");
        } else {
            System.out.println("A gép nyert " + computerChooseString + " választásával.");
        }

    }
}
