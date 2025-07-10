import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConsultaPelicula consultaPelicula = new ConsultaPelicula();
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Escriba el nombre de la película que desea buscar: ");

        try {
            var numeroDePelicula = Integer.valueOf(inputUser.nextLine());
            Pelicula pelicula =  consultaPelicula.buscarpelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);
        } catch (NumberFormatException e){
            System.out.println("Valor numerico no encontrado"+e.getMessage());
        }
        catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la ejecución del programa");
        }


    }
}
