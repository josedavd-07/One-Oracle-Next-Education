public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenid@s a Screen Match");
        System.out.println("\nPelicula: Matrix\n");

        //type data int
        int fechaDeLanzamiento = 1966;

        //boolean
        boolean incluidoEnElPlan = true;

        //decimales double lña precidencia de operaciones
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 6.0 + 9.0) /3;

        //impresion
        System.out.println(media);

        //cadena de caracteres string
        String sinopsis; // sin inicializar
        String sinopsisFilm = "suspenso";

        //String con bloque de texto evitar llamadas  de tantos println
        String sinopsisTextBlock = """
                Matrix es un a paradoja
                La mejor pelicula del fin del milenio
                fue lanzada en:
                """ + fechaDeLanzamiento; //Concatenacion de signo
        System.out.println(sinopsisTextBlock);

        //Casteo explicito se pierde datos decimales se  meten datos decimales dentro de  un  entero

        int clasificacion = (int)  (media/2);
        System.out.println(clasificacion);

    }
}