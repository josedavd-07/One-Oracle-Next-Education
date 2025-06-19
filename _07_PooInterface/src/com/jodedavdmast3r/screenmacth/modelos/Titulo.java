package com.jodedavdmast3r.screenmacth.modelos;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan (boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

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

                """, nombre, fechaDeLanzamiento, getDuracionEnMinutos(), incluidoEnElPlan);
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
