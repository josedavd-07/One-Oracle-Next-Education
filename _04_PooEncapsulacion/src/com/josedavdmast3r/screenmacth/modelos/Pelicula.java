package com.josedavdmast3r.screenmacth.modelos;

public class Pelicula {
    public String nombre;
    public int fechaDeLanzamiento;
    public int duracionEnMinutos;
    public boolean incluidoEnElPlan;
    public double sumaEvaluaciones;
    private int totalEvaluaciones;

    //Usa package-private por defecto
    public int getTotalEvaluaciones(){
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
    public void showInfo() {
        System.out.printf("""
                >> La película seleccionada fue: %s
                >> Fue lanzada en el año: %d
                >> Su duración es de: %d minutos
                >> Está incluida en el plan: %b

                """, nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan);
    }

    // Método para agregar notas
    public void evaluationFilm(double nota) {
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }


    public double calcularMedia() {
        return  (sumaEvaluaciones / totalEvaluaciones); // Aquí se puede ajustar el divisor según la cantidad de evaluaciones
    }
}
