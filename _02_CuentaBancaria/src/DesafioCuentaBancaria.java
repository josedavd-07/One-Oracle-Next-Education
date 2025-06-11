import java.util.Scanner;
import java.util.Locale;

public class DesafioCuentaBancaria {
    // Constants for colored output
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        inputUser.useLocale(Locale.US);

        //Section for data user
        String name;
        String TipoDeCuenta;
        double Saldo = 1500;

        //Message to welcome
        System.out.println("""
                
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                 Bienvenidos a  Banca de Ocidente
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                """)
        ;

        // Get info for user
        System.out.print("Por favor ingrese su nombre Completo: ");
        name = inputUser.nextLine();

        // Validate account type input
        while (true) {
            System.out.print("Tipo de cuenta corriente (C) o ahorro (A): ");
            TipoDeCuenta = inputUser.nextLine(); // Primero capturamos el dato


            if (TipoDeCuenta.equalsIgnoreCase("C")) {
                TipoDeCuenta = "Corriente";
                break;
            } else if (TipoDeCuenta.equalsIgnoreCase("A")) {
                TipoDeCuenta = "Ahorro";
                break;
            } else {
                System.out.println(ROJO + "Tipo de cuenta no válido. Por favor, ingrese 'C' para Corriente" +
                        " o 'A' para Ahorro." + RESET);
            }
        }

        //Clear console for ANSII System
        System.out.print("\033[H\033[2J");

        //Print info for User

        System.out.printf("""
                
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                 Bienvenido a Banca de Ocidente
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                
                Su informacion es la siguiente:
                -----------------------------------
                >> Nombre: %s
                >> Tipo de Cuenta: %s
                >> Saldo Actual: $%.0f
                
                -----------------------------------
                
                Gracias por confiar en nosotros,
                Continue disfrutando de nuestros servicios.
                
                """, name, TipoDeCuenta, Saldo)
        ;

        //Clear console for ANSII System
        System.out.print("\033[H\033[2J");

        String menu = """
                
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                 Bienvenido a Banca de Ocidente
                >>>>>>>>>>>>>>°°°°°°°<<<<<<<<<<<<<<
                
                Por favor, seleccione una opción:
                1. Consultar saldo
                2. Retirar dinero
                3. Depositar dinero
                4. Salir
                
                """;
        // Loop for menu options
        int opcion = 0;

        while (opcion != 4) {
            System.out.println(menu);
            System.out.print("Ingrese su opción: ");
            opcion = inputUser.nextInt();

            switch (opcion) {
                case 1: {
                    //print current balance
                    System.out.printf("Usuario %S, su saldo actual es: $%.0f%n", name, Saldo);
                    break;
                }
                case 2: {
                    //withdraw money
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = inputUser.nextDouble();

                    if (retiro > Saldo) {
                        System.out.println(ROJO + "Saldo insuficiente para realizar el retiro." + RESET);
                    } else {
                        Saldo -= retiro;
                        System.out.printf("Retiro exitoso. Su nuevo saldo es: $%.0f%n", Saldo);
                    }
                    break;
                }
                case 3: {
                    //deposit money
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = inputUser.nextDouble();

                    if (deposito <= 0) {
                        System.out.println(ROJO + "El monto a depositar debe ser mayor que cero." + RESET);
                    } else {
                        Saldo += deposito;
                        System.out.printf("Depósito exitoso. Su nuevo saldo es: $%.0f%n", Saldo);
                    }
                    break;
                }
                case 4: {
                    //exit the program
                    System.out.println("Gracias por usar Banca de Ocidente. ¡Hasta luego!");
                    break;
                }
                default: {
                    //invalid option
                    System.out.println(ROJO + "Opción no válida. Por favor, intente de nuevo." + RESET);
                    break;
                }
            }
        }


    }
}


