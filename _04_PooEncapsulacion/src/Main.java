import com.josedavdmast3r.screenmacth.modelos.Pelicula;
import com.josedavdmast3r.screenmacth.modelos.PeliculaRefactor;

public class Main {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Enredados";
        miPelicula.fechaDeLanzamiento = 2010;
        miPelicula.duracionEnMinutos = 100;
        miPelicula.incluidoEnElPlan = true;

        Pelicula.showBanner();
        miPelicula.showInfo();           // Método de instancia

        miPelicula.evaluationFilm(8.5); // Agregar una evaluación
        miPelicula.evaluationFilm(9.0); // Agregar otra evaluación
        miPelicula.evaluationFilm(7.5); // Agregar una evaluación más

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

        System.out.println("\n***********************\n");
        //Clase refactorizada con encapsulación de getters y setters
        PeliculaRefactor miPelicula1 = new PeliculaRefactor();
        miPelicula1.setNombre("Kung Fu Panda");
        miPelicula1.setFechaDeLanzamiento(2008);
        miPelicula1.setDuracionEnMinutos(92);
        miPelicula1.setIncluidoEnElPlan(true); // Usando el setter para establecer el valor

        miPelicula1.evaluationFilm(9.0); // Agregar una evaluación
        miPelicula1.evaluationFilm(8.5); // Agregar otra evaluación
        miPelicula1.evaluationFilm(9.5); // Agregar una evaluación más

        PeliculaRefactor.showBanner(); // Método estático
        miPelicula1.showInfo();           // Método de instancia

        System.out.println(miPelicula1.getTotalEvaluaciones());
        System.out.println(miPelicula1.calcularMedia());


        //Ejemplo 3 de  como usar bien la encapculacion set y get

        PeliculaRefactor miPelicula2 = new PeliculaRefactor();
        miPelicula2.setNombre("Blanca Nieves");
        miPelicula2.setFechaDeLanzamiento(1937);
        miPelicula2.setDuracionEnMinutos(83);
        miPelicula2.setIncluidoEnElPlan(false); // Usando el setter para establecer el valor

        miPelicula2.evaluationFilm(8.0); // Agregar una evaluación
        miPelicula2.evaluationFilm(7.5); // Agregar otra evaluación
        miPelicula2.evaluationFilm(8.5); // Agregar una evaluación más

        System.out.printf("""
                ***********************************
                
                
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                     Bienvenid@ a ScreenMatch
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                
                >> La película seleccionada fue: %s
                >> Fue lanzada en el año: %d
                >> Su duración es de: %d minutos
                >> Está incluida en el plan: %b
                >> Total de evaluaciones: %d
                >> Media de evaluaciones: %.2f
                """,miPelicula2.getNombre(),miPelicula2.getFechaDeLanzamiento(),miPelicula2.getDuracionEnMinutos(),
                miPelicula2.isIncluidoEnElPlan(), miPelicula2.getTotalEvaluaciones(), miPelicula2.calcularMedia())
        ;




    }
}
