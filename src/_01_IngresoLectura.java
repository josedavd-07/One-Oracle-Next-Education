import java.util.Scanner;
import java.util.Locale;

public class _01_IngresoLectura {

    public static void main(String[] args) {

        // Creamos el objeto para leer entradas del usuario
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // Usar punto como separador decimal

        // Solicitar datos
        System.out.println("Nombre de tu película favorita:");
        String nombrePelicula = entrada.nextLine();

        System.out.println("Año de estreno:");
        int añoEstreno = entrada.nextInt();

        System.out.println("Nota que le das (ej: 8.5):");
        double notaUsuario = entrada.nextDouble();

        // Casting a entero (se pierde decimal)
        int notaEntera = (int)notaUsuario;

        // Mostrar resultado con formato
        System.out.printf("Película: %s\nAño: %d\nNota (entera): %d sobre 10\n",
                nombrePelicula, añoEstreno, notaEntera);
    }
}
