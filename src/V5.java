import java.time.LocalTime;
import java.util.Scanner;

public class V5 {
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

        String idioma;
        while (true) {
            System.out.print("¿En qué idioma prefieres el saludo? (es/en) ");
            idioma = scanner.nextLine().toLowerCase();
            if (idioma.equals("es") || idioma.equals("en")) {
                break;
            }
            System.out.println("Por favor, ingresa 'es' para español o 'en' para inglés.");
        }

        int hora = LocalTime.now().getHour();
        String saludo = obtenerSaludo(hora, idioma);

        System.out.println(saludo + ", " + nombre + "!");
    }

    public static String obtenerSaludo(int hora, String idioma) {
        if (idioma.equals("es")) {
            if (hora < 12) {
                return "Buenos días";
            } else if (hora < 18) {
                return "Buenas tardes";
            } else {
                return "Buenas noches";
            }
        } else {
            if (hora < 12) {
                return "Good morning";
            } else if (hora < 18) {
                return "Good afternoon";
            } else {
                return "Good evening";
            }
        }
    }
}
