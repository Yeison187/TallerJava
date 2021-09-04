import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String opcionMenu = "";
        Scanner entrada = new Scanner(System.in);
        DatoValido datoValido = new DatoValido();
        ejercicios ejercicio = new ejercicios();

        while (true) {
            datoValido.menu();
            System.out.print("Digite un numero, según el item a consultar: ");
            opcionMenu = entrada.nextLine();

            if (datoValido.isInt(opcionMenu)) {
                opcionMenu = datoValido.deleteSpace(opcionMenu);
                if (opcionMenu.equals("0")) {
                    break;
                }
                switch (opcionMenu) {
                    case "1":
                        System.out.println(ejercicio.numeroMayor(5, 3));
                        break;

                    case "2":

                        double numero1 = datoValido.solicitarNumero(entrada);

                        double numero2 = datoValido.solicitarNumero(entrada);

                        System.out.println(ejercicio.numeroMayor(numero1,numero2));

                        break;

                    case "3":
                        double radio = datoValido.solicitarNumero(entrada);
                        System.out.println("El área del círculo es " + ejercicio.areaCirculo(radio) + "metros");
                        break;

                    case "4":
                        double precio = datoValido.solicitarNumero(entrada);
                        System.out.println("El total a pagar es " + ejercicio.precioFinal(precio));
                        break;

                    case "5":
                        ejercicio.mostrarParesImpares("5");
                        break;


                    case "6":
                        ejercicio.mostrarParesImpares("6");
                        break;


                    case "7":
                        break;

                    case "8":
                        break;

                    case "9":

                        break;

                    case "10":
                         break;
                    default:
                        System.out.println("Opción no valida, recuerda que los item validos son de 0 y 18");
                        break;

                }

            } else {
                System.out.println("Recuerde que el sistema recibe solo números enteros entre 0 y 18");
            }
        }


    }
}
