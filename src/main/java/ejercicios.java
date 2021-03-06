import javax.swing.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class ejercicios extends DatoValido {

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

    public void esCero(Scanner entrada) {

        double numero = 0;
        do {

            numero = solicitarNumero(entrada);
            if (numero == 0) {
                System.out.println("El número digitado es igual a cero");
            } else if (numero > 0) {
                System.out.println("El numero es mayor a cero");
            } else {
                System.out.println("El numero es menor a cero");
            }

        } while (numero < 0);
    }

    public boolean diaLaboral(String diaSemana) {
        switch (diaSemana.toLowerCase()) {
            case "sabado": {
                System.out.println("Es sabado alegre :), no se trabaja");
                break;
            }
            case "domingo": {
                System.out.println("Domingo de paseo, no se trabaja :) :)");
                break;
            }

            case "lunes": {
                System.out.println("Los lunes, se trabaja con actitud");
                break;
            }
            case "martes": {
                System.out.println("Los martes , trabajan con alegria:) :)");
                break;
            }

            case "miercoles": {
                System.out.println("Los miercoles, trabajando con mucho amor ");
                break;
            }
            case "jueves": {
                System.out.println("Los jueves, se labora con todo el combo");
                break;
            }

            case "viernes": {
                System.out.println("Los viernes, la rompemos");
                break;
            }


            default:
                System.out.println("Algo salio mal, te enviare al menú principal. ");
                System.out.println("Quizas se apunto mal el dia de la semana");

                break;


        }
        return true;
    }

    public String reemplazarAporE(){
        String frase = "La sonrisa sera la mejor arma contra la tristeza, ";
        return frase.replace("a","e");
    }

    public int contarVocal(String cadena, char vocal){
        int contador = 0;
        char aux;
        String frase = cadena.toLowerCase();
        for (int i = 0;  i < cadena.length(); i++){
            aux = frase.charAt(i);
            if(aux == vocal){
                contador++;
            }

        }
        return contador;
    }

    public boolean isEqualCadena(String cadena1, String cadena2){
        if (cadena1.equals(cadena1)){
            return true;
        }
        return false;
    }

    public void mostrarFechaActual(){
        LocalDate dia = LocalDate.now();
        LocalTime hora = LocalTime.now();
        System.out.println(dia +" " +hora);

    }

    public void imprimirNumerosConSalto(double numero) {
    int aux = (int)numero;
    String mensaje = "";

    for (int i = aux; i <= 1000; i+=2){
        mensaje = mensaje.concat(i + " - ");

        if (i % 50 == 0 || (i-1) % 50 == 0){
            mensaje = mensaje.concat(" \n ");
        }

    }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public  void getionCinematografica(Scanner entrada){
        int aux = 0;
        do {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");

            aux = (int)solicitarNumero(entrada);
            if (aux < 1 || aux > 8){
                System.out.println("OPCIÓN INCORRECTA. Recuerda que solo son validos los numeros del 1 al 8");
            }
        }while (aux != 8 );

    }

}
