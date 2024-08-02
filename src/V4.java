import java.time.LocalTime;
import java.util.Scanner;

public class V4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;

        while (true) {
            System.out.print("¿Cuál es tu nombre? ");
            nombre = scanner.nextLine();
            if (!nombre.trim().isEmpty()) {
                break;
            }
            System.out.println("Por favor, ingresa un nombre válido.");
        }

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