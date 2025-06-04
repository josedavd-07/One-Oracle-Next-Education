public class Main {
    public static void main(String[] args) {

        // Saludo inicial
        System.out.println("Bienvenid@s a Screen Match");

        // Mostrar información de la película
        System.out.println("\nPelícula: Matrix\n");

        // Variables básicas
        int fechaDeLanzamiento = 1966;           // Entero
        boolean incluidoEnElPlan = true;         // Booleano
        double notaDeLaPelicula = 8.2;           // Decimal

        // Cálculo de promedio entre 3 notas
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println("Promedio de notas: " + media);

        // Texto con múltiples líneas (text block)
        String sinopsisTextBlock = """
            Matrix es una paradoja.
            La mejor película del fin del milenio.
            Fue lanzada en:
            """ + fechaDeLanzamiento;

        System.out.println(sinopsisTextBlock);

        // Casting: convertir double a int
        int clasificacion = (int)(media / 2);
        System.out.println("Clasificación (media / 2 redondeada): " + clasificacion);
    }
}
