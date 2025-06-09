import java.util.Random;
import java.util.Scanner;

public class _07_EjercicioCurso {

    public static void main(String[] args) {

        //Importamos la clase random  para numeros aleatorios.

        Random random = new Random();
        int numeroSecretoAleatorio = random.nextInt(101);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Bienvenido al juego de adivinanzas. Tienes 10 intentos para acertar un número entre 0 y 100.");

        for(int i = 0; i < 10; i++ ){

            System.out.println("Ingresa un numero del 0 al 100");
            int intento = userInput.nextInt();

            if(numeroSecretoAleatorio == intento){

                System.out.printf("Correcto has acertado el numero ingresado  es igual al numero aleatorio %d",
                        numeroSecretoAleatorio);
                break;
            }
            else{
                System.out.println("No haz acertado lo siento mucho vuelve a intentarlo");
            }

        }
        System.out.println("Gracias por jugar y divertirte");
    }

}
