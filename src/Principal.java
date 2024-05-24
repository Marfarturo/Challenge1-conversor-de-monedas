import java.util.Scanner;
import java.util.SortedMap;

public class Principal {

    public static void main(String[] args) {

      //  llamada a la API
        ConexionApiMoneda conexion = new ConexionApiMoneda();

       //Menú de Opciones de conversión.
        while (true) {

            // Mensaje de Bienvenida

            String mensaje = "Bienvenid@ al Conversor de Monedas.";
            System.out.println("\n*************************************");
            System.out.println(mensaje);
            System.out.println("*************************************\n");

            String menu = """                
                                 TIPOS DE CONVERSIONES:
                                 
                1) Dólar (USD)             a ===>    Peso Argentino (ARS).
                2) Peso Argentino (ARS)    a ===>    Dólar (USD).
                3) Dólar (USD)             a ===>    Real Brasileño (BRL).
                4) Real Brasileño (BRL)    a ===>    Dólar (USD).
                5) Dólar (USD)             a ===>    Peso Colombiano (COP).
                6) Peso Colombiano (COP)   a ===>    Dólar (USD).
                9) Salir.
                """;

            System.out.println("***********************************************************");
            System.out.println(menu);
            Scanner scanner = new Scanner(System.in);
            System.out.println("***********************************************************");
            System.out.println("Digíte el número de la conversión que desea realizar: ");

            //Inicializar Opción
            int opcion = 0;
            opcion = scanner.nextInt();

            if(opcion == 9){
                System.out.println("*********************************************************");
                System.out.println("Saliendo del programa, Conversión de Moneda finalizada.");
                System.out.println("*********************************************************");
                break;
            }
            String monedaOpcion = new String();
            double cantidadMoneda;


            switch (opcion) {

                case 1:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad que se desea convertir: ");
                    cantidadMoneda = Double.parseDouble(scanner.nextLine());
                    Moneda moneda1 = conexion.buscarMoneda("USD/ARS/", cantidadMoneda);
                    System.out.println("La conversion de " + cantidadMoneda + " Dólares (USD) a Pesos Argentinos (ARS) es: "
                            + moneda1.conversion_result() + "$");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad que se desea convertir: ");
                    cantidadMoneda = Double.parseDouble(scanner.nextLine());
                    Moneda moneda2 = conexion.buscarMoneda("ARS/USD/", cantidadMoneda);
                    System.out.println("La conversion de " + cantidadMoneda + " Pesos Argentinos (ARS) a Dólares (USD) es: "
                            + moneda2.conversion_result() + "$");
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad que se desea convertir: ");
                    cantidadMoneda = Double.parseDouble(scanner.nextLine());
                    Moneda moneda3 = conexion.buscarMoneda("USD/BRL/", cantidadMoneda);
                    System.out.println("La conversion de " + cantidadMoneda + " Dólares (USD) a Reales Brasileños (BRL) es: "
                            + moneda3.conversion_result() + "$");
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad que se desea convertir: ");
                    cantidadMoneda = Double.parseDouble(scanner.nextLine());
                    Moneda moneda4 = conexion.buscarMoneda("BRL/USD/", cantidadMoneda);
                    System.out.println("La conversion de " + cantidadMoneda + " Reales Brasileños (BRL) a Dólares (USD) es: "
                            + moneda4.conversion_result() + "$");
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad que se desea convertir: ");
                    cantidadMoneda = Double.parseDouble(scanner.nextLine());
                    Moneda moneda5 = conexion.buscarMoneda("USD/COP/", cantidadMoneda);
                    System.out.println("La conversion de " + cantidadMoneda + " Dólares (USD) a Pesos Colombianos (COP) es: "
                            + moneda5.conversion_result() + "$");
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad que se desea convertir: ");
                    cantidadMoneda = Double.parseDouble(scanner.nextLine());
                    Moneda moneda6 = conexion.buscarMoneda("COP/USD/", cantidadMoneda);
                    System.out.println("La conversion de " + cantidadMoneda + " Pesos Colombianos (COP) a Dólares (USD) es: "
                            + moneda6.conversion_result() + "$");
                    break;
                default:

                    System.out.println("*************************************************");
                    System.out.println("Opción no permitida, digíte un número válido!");
                    System.out.println("*************************************************");
                    break;
            }
        }
    }
}


