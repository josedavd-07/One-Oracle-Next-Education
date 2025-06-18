public class Main {
    public static void main(String[] args) {

        // --- Versión 1: Sin métodos ---
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Enredados";
        miPelicula.fechaDeLanzamiento = 2010;
        miPelicula.duracionEnMinutos = 100;
        miPelicula.incluidoEnElPlan = true;

        System.out.println("""
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                     Bienvenid@ a ScreenMatch
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                """)
        ;

        System.out.printf("""
                >> La película seleccionada fue: %s
                >> Fue lanzada en el año: %d
                >> Su duración es de: %d minutos
                >> Está incluida en el plan: %b

                """, miPelicula.nombre, miPelicula.fechaDeLanzamiento, miPelicula.duracionEnMinutos, miPelicula.incluidoEnElPlan)
        ;

        // Limpieza de consola ANSI
        System.out.print("\033[H\033[2J");

        // --- Versión 2: Con métodos --- primera pelicula
        PeliculaRefactor dataFilm = new PeliculaRefactor();
        dataFilm.nombre = "Matrix";
        dataFilm.fechaDeLanzamiento = 2015;
        dataFilm.duracionEnMinutos = 100;
        dataFilm.incluidoEnElPlan = true;

        PeliculaRefactor.showBanner(); // Método estático
        dataFilm.showInfo();           // Método de instancia
        dataFilm.evaluationFilm(8.5); // Agregar una evaluación
        dataFilm.evaluationFilm(9.0); // Agregar otra evaluación

        System.out.println(dataFilm.sumaEvaluaciones);
        System.out.println(dataFilm.totalEvaluaciones);
        System.out.println(dataFilm.calcularMedia()); // Calcular la media de las evaluaciones

        //segunda pelicula
        PeliculaRefactor dataFilm2 = new PeliculaRefactor();
        dataFilm2.nombre = "Avatar";
        dataFilm2.fechaDeLanzamiento = 2020;
        dataFilm2.duracionEnMinutos = 150;
        dataFilm2.incluidoEnElPlan = false;

        PeliculaRefactor.showBanner();
        dataFilm2.showInfo();           // Método de instancia
        dataFilm2.evaluationFilm(9.0); // Agregar una evaluación
        dataFilm2.evaluationFilm(8.0); // Agregar otra evaluación

        System.out.println(dataFilm2.sumaEvaluaciones);
        System.out.println(dataFilm2.totalEvaluaciones);
        System.out.println(dataFilm2.calcularMedia()); // Calcular la media de las evaluaciones



}   }
