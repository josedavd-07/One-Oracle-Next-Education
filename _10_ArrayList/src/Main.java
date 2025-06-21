import com.jodedavdmast3r.screenmacth.calculos.CalculadoraDeTiempo;
import com.jodedavdmast3r.screenmacth.calculos.FiltroRecomendacion;
import com.jodedavdmast3r.screenmacth.modelos.Episodio;
import com.jodedavdmast3r.screenmacth.modelos.Pelicula;
import com.jodedavdmast3r.screenmacth.modelos.Serie;

import java.util.ArrayList;

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

        System.out.println("\n******************************************\n");

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("El Rey León");
        otraPelicula.setFechaDeLanzamiento(1994);
        otraPelicula.setDuracionEnMinutos(88);



        System.out.println("\n******************************************\n");
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.printf("Tiempo necesario para ver todas las series es de: %d minutos ",calculadora.getTiempoTotal());

        System.out.println("\n******************************************\n");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setNombre("El inicio de la aventura");
        episodio1.setSerie(casaDragon);
        episodio1.setTotalVisualizaciones(1200); // Simulando visualizaciones
        filtroRecomendacion.filtra(episodio1);

        var myFilm = new Pelicula();
        myFilm.setNombre("El lorax el guardián del bosque");
        myFilm.setDuracionEnMinutos(90);
        myFilm.setFechaDeLanzamiento(2012);

        //Haremos uso del arrayList
        ArrayList<Pelicula> listaDepeliculas = new ArrayList<>();
        listaDepeliculas.add(miPelicula);
        listaDepeliculas.add(otraPelicula);
        listaDepeliculas.add(myFilm);

        System.out.printf("""
                >> El tamaño de la lista es: %d
                >> La primera película es: %s
                >> La lista de películas es: %s
                """, listaDepeliculas.size(), listaDepeliculas.get(0).getNombre(),listaDepeliculas.toString(),
                listaDepeliculas.get(0).toString())
        ;



    }
}
