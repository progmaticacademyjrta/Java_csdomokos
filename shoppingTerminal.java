import java.sql.SQLOutput;
import java.util.Scanner;

public class shoppingTerminal {

    public static void main(String[] args) {


        String truck1 = "SCANIA";
        String truck2 = "VOLVO";
        String truck3 = "DAF";
        String truck4 = "MAN";
        String truck5 = "IVECO";
        String truck6 = "FORD";
        String truck7 = "RENAULT";

        int SCANIA = 50000;
        int VOLVO = 50000;
        int DAF = 44000;
        int MAN = 46000;
        int IVECO = 35000;
        int FORD = 40000;
        int RENAULT = 33000;

        String euro = "EUR";

        int finalPay = 0;
        int scaniaPay = 0;
        int volvoPay = 0;
        int dafPay = 0;
        int manPay = 0;
        int ivecoPay = 0;
        int fordPay = 0;
        int renaultPay = 0;
        int secondPrice = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Az alábbi kamionokkal rendelkezünk:");
        System.out.println("1." + truck1 + " 2." + truck2 + " 3." + truck3 + " 4." + truck4 + " 5." + truck5 + " 6." + truck6 + " 7." + truck7);
        System.out.println();

        System.out.println("Írja be, hogy 'LISTA', ahhoz, hogy kilistázza a kamionok árait.");

        String priceLister = scanner.nextLine();
        System.out.println();
        if (priceLister.equals("LISTA")) {
            System.out.println(truck1 + ": " + SCANIA + " " + euro);
            System.out.println(truck2 + ": " + VOLVO + " " + euro);
            System.out.println(truck3 + ": " + DAF + " " + euro);
            System.out.println(truck4 + ": " + MAN + " " + euro);
            System.out.println(truck5 + ": " + IVECO + " " + euro);
            System.out.println(truck6 + ": " + FORD + " " + euro);
            System.out.println(truck7 + ": " + RENAULT + " " + euro);
        }
        System.out.println();
        System.out.println("Válasszon a fenti kamionok közül és írja be nagybetűvel!");
        String pickTruck = scanner.nextLine();
        if (pickTruck.equals("SCANIA")) {
            System.out.println("Ön a " + truck1 + "-t választotta.");
        } else if (pickTruck.equals("VOLVO")) {
            System.out.println("Ön a " + truck2 + "-t választotta.");
        } else if (pickTruck.equals("DAF")) {
            System.out.println("Ön a " + truck3 + "-t választotta.");
        } else if (pickTruck.equals("MAN")) {
            System.out.println("Ön a " + truck4 + "-t választotta.");
        } else if (pickTruck.equals("IVECO")) {
            System.out.println("Ön a " + truck5 + "-t választotta.");
        } else if (pickTruck.equals("FORD")) {
            System.out.println("Ön a " + truck6 + "-t választotta.");
        } else if (pickTruck.equals("RENAULT")) {
            System.out.println("Ön a " + truck7 + "-t választotta.");
        }

        System.out.println();
        System.out.println("Hány kamiont kíván vásárolni az adott márkából? Maximálisan 5 db kamion rendelhető.");
        int numberOfTrucks = scanner.nextInt();
        switch (numberOfTrucks) {
            case 1:
                System.out.println("Ön " + numberOfTrucks + " db kamiont rendelt az adott márkából.");
                break;
            case 2:
                System.out.println("Ön " + numberOfTrucks + " db kamiont rendelt az adott márkából.");
                break;
            case 3:
                System.out.println("Ön " + numberOfTrucks + " db kamiont rendelt az adott márkából.");
                break;
            case 4:
                System.out.println("Ön " + numberOfTrucks + " db kamiont rendelt az adott márkából.");
                break;
            case 5:
                System.out.println("Ön " + numberOfTrucks + " db kamiont rendelt az adott márkából.");
                break;
        }
        System.out.println();
        System.out.println("Kíván más teherautót is vásárolni? (IGEN/NEM).");
        scanner = new Scanner(System.in);
        String furtherShopping = scanner.nextLine();
        String pickTruck2 = null;
        if (furtherShopping.equals("IGEN")) {
            System.out.println("Válasszon a fenti kamionok közül és írja be nagybetűvel!");
            pickTruck2 = scanner.nextLine();
            if (pickTruck2.equals("SCANIA")) {
                System.out.println("Ön a " + truck1 + "-t választotta.");
            } else if (pickTruck2.equals("VOLVO")) {
                System.out.println("Ön a " + truck2 + "-t választotta.");
            } else if (pickTruck2.equals("DAF")) {
                System.out.println("Ön a " + truck3 + "-t választotta.");
            } else if (pickTruck2.equals("MAN")) {
                System.out.println("Ön a " + truck4 + "-t választotta.");
            } else if (pickTruck2.equals("IVECO")) {
                System.out.println("Ön a " + truck5 + "-t választotta.");
            } else if (pickTruck2.equals("FORD")) {
                System.out.println("Ön a " + truck6 + "-t választotta.");
            } else if (pickTruck2.equals("RENAULT")) {
                System.out.println("Ön a " + truck7 + "-t választotta.");
            }

            if (pickTruck2.equals("SCANIA")) {
                secondPrice = SCANIA;
            } else if (pickTruck2.equals("VOLVO")) {
                secondPrice = VOLVO;
            } else if (pickTruck2.equals("DAF")) {
                secondPrice = DAF;
            } else if (pickTruck2.equals("MAN")) {
                secondPrice = MAN;
            } else if (pickTruck2.equals("IVECO")) {
                secondPrice = IVECO;
            } else if (pickTruck2.equals("FORD")) {
                secondPrice = FORD;
            } else if (pickTruck2.equals("RENAULT")) {
                secondPrice = RENAULT;
            }


        } else if (furtherShopping.equals("NEM")) {
            System.out.println();
            System.out.println("Ugrás a fizetés oldalra");
        } else {
            System.out.println("Rendelés leadása befejezve.");
        }

        System.out.println("Kívánja folytatni a vásárlást?(IGEN/NEM)");
        String escShopping = scanner.nextLine();
        if (escShopping.equals("IGEN")) {
            System.out.println();
            System.out.println("Az Ön vásárlásának a részletei:");
            System.out.println("A vásárolt kamion(ok):");

            if (furtherShopping.equals("NEM")) {
                System.out.println(numberOfTrucks + " " + pickTruck);
            } else if (furtherShopping.equals("IGEN")) {
                System.out.println(numberOfTrucks + " " + pickTruck + " és 1 " + pickTruck2);
            }
            ;

            System.out.println("A megvásárolt kamion(ok) ára összesen:");

            if (pickTruck.equals("SCANIA")) {
                finalPay = SCANIA * numberOfTrucks + secondPrice;
                System.out.println(finalPay + " " + euro);
            } else if (pickTruck.equals("VOLVO")) {
                finalPay = VOLVO * numberOfTrucks + secondPrice;
                System.out.println(finalPay + " " + euro);
            } else if (pickTruck.equals("DAF")) {
                finalPay = DAF * numberOfTrucks + secondPrice;
                System.out.println(finalPay + " " + euro);
            } else if (pickTruck.equals("MAN")) {
                finalPay = MAN * numberOfTrucks + secondPrice;
                System.out.println(finalPay + " " + euro);
            } else if (pickTruck.equals("IVECO")) {
                finalPay = IVECO * numberOfTrucks + secondPrice;
                System.out.println(finalPay + " " + euro);
            } else if (pickTruck.equals("FORD")) {
                finalPay = FORD * numberOfTrucks + secondPrice;
                System.out.println(finalPay + " " + euro);
            } else if (pickTruck.equals("RENAULT")) {
                finalPay = RENAULT * numberOfTrucks + secondPrice;
                System.out.println(finalPay + " " + euro);
            }
            System.out.println("Fizetés következik. Kérjük írja be a terhelni kívánt összeget!");
            int priceScanner = scanner.nextInt();
            if (priceScanner == finalPay) {
                System.out.println("Köszönjük, hogy nálunk vásárolt.");
            } else if (priceScanner < finalPay) {
                System.out.println("Kevesebbet terhelt, mint a végösszeg. Kérjük, emelje az összeget " + (finalPay - priceScanner) + " " + euro + " összeggel.");
                int priceScanner2 = scanner.nextInt();
                if (priceScanner2 == finalPay) {
                    System.out.println("Köszönjük, hogy nálunk vásárolt.");
                }
            } else if (priceScanner > finalPay) {
                System.out.println("Többet terhelt, mint a végösszeg. A visszajáró " + (priceScanner - finalPay) + " " + euro + ". Köszönjök, hogy nálunk vásárolt.");
            } else if (escShopping.equals("NEM")) {
                System.out.println("Köszönjük, hogy oldalunkra látogatott. Viszontlátásra!");
            } else {
                System.out.println("Sajnos hiba történt, kérem indítsa újra a vásárlást.");
            }
        }
    }

}
