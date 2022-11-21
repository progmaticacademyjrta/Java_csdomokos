import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BodyTemperatureTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Adja meg a rögzíteni kívánt testhőmérsékletek számát:");
        int numberOfTemp = scanner.nextInt();

        List<Double> bodyTemperatures = new ArrayList<>();


        double temperature = 0;
        for (int i = 0; i < numberOfTemp; i++) {
            System.out.println("Adja meg a rögzíteni kívánt testhőmérsékeltet:");
            temperature = scanner.nextDouble();


            if (bodyTemperatures.contains(temperature)) {
                System.out.println("Ezzel az értékkel adat már lett rögzítve. Ha rögzíteni akarja, írja be 'igen'.");
                scanner.nextLine();
                String contInput = scanner.nextLine();
                if (contInput.equals("igen")) {
                    bodyTemperatures.add(temperature);
                }
            } else {
                bodyTemperatures.add(temperature);
            }
        }


        System.out.println("A rögzített testhőmérsékletek: " + bodyTemperatures);

        double averageTemperature = 0;
        double totalTemperature = 0;

        for (int i = 0; i < bodyTemperatures.size(); i++) {
            totalTemperature += bodyTemperatures.get(i);
            averageTemperature = totalTemperature / bodyTemperatures.size();
        }

        System.out.println("Testhőmérsékletek átlaga: " + averageTemperature);

        System.out.println("A következő testhőmérsékletekkel volt lázas: ");
        for (int i = 0; i < bodyTemperatures.size(); i++) {
            if (bodyTemperatures.get(i) > 37.0)
                System.out.print(bodyTemperatures.get(i) + " ");
        }


    }
}
