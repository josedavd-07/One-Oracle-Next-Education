public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaEvaluaciones;
    private int totalEvaluaciones;

    //Usa package-private por defecto
    int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    // Método estático (no necesita crear objeto)
    public static void showBanner() {
        System.out.println("""
                
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                     Bienvenid@ a ScreenMatch
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                """);
    }

    // Método de instancia (requiere crear objeto)
    void showInfo() {
        System.out.printf("""
                >> La película seleccionada fue: %s
                >> Fue lanzada en el año: %d
                >> Su duración es de: %d minutos
                >> Está incluida en el plan: %b

                """, nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan);
    }

    // Método para agregar notas
    void evaluationFilm(double nota) {
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }


    double calcularMedia() {
        return  (sumaEvaluaciones / totalEvaluaciones); // Aquí se puede ajustar el divisor según la cantidad de evaluaciones
    }
}
