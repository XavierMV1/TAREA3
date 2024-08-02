import java.time.LocalTime;
import java.util.Scanner;

public class V3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        int hora = LocalTime.now().getHour();
        String saludo;

        if (hora < 12) {
            saludo = "Buenos días";
        } else if (hora < 18) {
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        System.out.println(saludo + ", " + nombre + "!");
    }
}