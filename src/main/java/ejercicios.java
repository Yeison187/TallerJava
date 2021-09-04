import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicios {

    public String numeroMayor(double numero, double numero2) {
        String mensaje = "";
        if (numero > numero2) {
            mensaje = "El número " + numero + " es mayor que el número " + numero2;
        } else if (numero == numero2) {
            mensaje = "Son iguales";
        } else {
            mensaje = "El número " + numero2 + " es mayor que el número " + numero;
        }
        return mensaje;
    }

    public double areaCirculo(double numero) {
        return Math.PI * Math.pow(numero, 2);
    }

    public double precioFinal(double precio) {
        return precio + (precio * 0.21);
    }

    public void mostrarParesImpares(String cadena) {
        int numero = 1;
        if (cadena.equals("5")) {
            while (numero < 101) {
                if (numero % 2 == 0) {
                    System.out.print(numero + " es par ");
                } else {
                    System.out.println("  ---  " + numero + " es impar");
                }
                numero++;
            }
        } else {
            for (int i = 1; i < 101; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " es par ");
                } else {
                    System.out.println("  ---  " + i + " es impar");
                }
            }
        }
    }

    public void esCero(Scanner entrada){
        String numero = "";
        do {
            System.out.println("Digite un numero ");
            numero = entrada.nextLine();


        } while(true);
    }
}
