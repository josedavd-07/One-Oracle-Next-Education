import java.util.Scanner;
import java.util.Locale;

public class _01_IngresoLectura {

    public static void main(String[] args) {

        //Entrada del ususario se necesita el scaner para estas lecturas de datos
        Scanner entradaUserTeclado = new Scanner(System.in);
        entradaUserTeclado.useLocale(Locale.US); // <--- Esta línea es la clave

        //input User
        System.out.println("Por favor ingrese  el nombre de su pelicula favorita: ");
        String nameFilm  = entradaUserTeclado.nextLine();

        System.out.println("Por favor ingresa la fecha de  lanzamiento de la pelicula que mencionaste: ");
        int DatePresentationFilm = entradaUserTeclado.nextInt();

        System.out.println("Por ultimo que nota le das a esta película: ");
        double calificationFilm = entradaUserTeclado.nextDouble();

        //Casting de la información de forma explicita perdemos los decimales y queda su valor enteros

        int calificacionInt = (int) calificationFilm;

        System.out.printf("La película mencionada fue: %s\nEsta se estreno en el año: %d\nSu" +
                " calificación Otorgada es de: %d puntos sobre 10",nameFilm, DatePresentationFilm, calificacionInt)
        ;

    }
}
