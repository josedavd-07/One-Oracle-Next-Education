import com.josedavdmast3r.screenmacth.modelos.Pelicula;
import com.josedavdmast3r.screenmacth.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Enredados");
        miPelicula.setFechaDeLanzamiento(2010);
        miPelicula.setDuracionEnMinutos(100);
        miPelicula.setIncluidoEnElPlan(true);

        Pelicula.showBanner();
        miPelicula.showInfo();           // Método de instancia

        miPelicula.evaluationFilm(8.5); // Agregar una evaluación
        miPelicula.evaluationFilm(9.0); // Agregar otra evaluación
        miPelicula.evaluationFilm(7.5); // Agregar una evaluación más

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

        System.out.println("\n=====================================\n");
        // Crear una instancia de Serie
        Serie casaDragon = new Serie();
        casaDragon.setNombre("La Casa del Dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        casaDragon.evaluationFilm(9.5);  // Agregar una evaluación
        casaDragon.evaluationFilm(9.0);  // Agregar otra evaluación
        casaDragon.evaluationFilm(8.5);  // Agregar una evaluación más

        Serie.showBanner();
        casaDragon.showInfo();           // Método de instancia
        System.out.println(casaDragon.getDuracionEnMinutos());



    }
}
