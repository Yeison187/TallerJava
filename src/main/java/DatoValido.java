import java.sql.SQLOutput;
import java.util.Scanner;

public class DatoValido {



    public boolean isInt(String cadena){
        try{
            Integer.parseInt(deleteSpace(cadena));
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public boolean isDouble(String cadena){
        try{
            Double.parseDouble(deleteSpace(cadena));
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public String deleteSpace(String cadena){
        return cadena.replace(" ","");
    }

    public String changePointToEat(String cadena){return  cadena.replace(",",".");}

    public void menu (){
        System.out.println(" ");
        System.out.println("******************  Menú  *****************************");
        System.out.println(" ");
        System.out.println("Para acceder a cada ejercicio digita el número del item");
        System.out.println("1. Numero mayor, ya definidos");
        System.out.println("2. Número mayor, enviando parametros");
        System.out.println("3. Área del círculo");
        System.out.println("4. Digita cero en caso de querer cerrar el programa");
        System.out.println("5. Números pares e impares con while");
        System.out.println("6. Números pares e impares con for");
        System.out.println("7. Comprobar si un numero es mayor o igual a cero");
        System.out.println("8. Comprobar si es dia laboral");
        System.out.println("9. Reemplaza todas las A del String por una E");
        System.out.println("10. Eliminar espacios de frase insertada por consola");
        System.out.println("11. longitud de frase, cantidad vocales tiene de “a,e,i,o,u”.");
        System.out.println("12. Cadenas iguales ? sino, diferencias.");
        System.out.println("13. Fecha actual, formato (AAAA/MM/DD) (HH:MM:SS)");
        System.out.println("14. Imprima por pantalla el numero introducido hasta 1000 con saldos de 2 en 2.");
        System.out.println("15. Gestión cinematografica");

    }

    public double solicitarNumero(Scanner entrada){
        String cadena = "";
        double numero = 0;
        System.out.println("*************************");
        System.out.print("Digite un número: ");
        cadena = entrada.nextLine();
        cadena = changePointToEat(cadena);

        if (!isDouble(cadena)){
            System.out.println("Recuerda, solo números");
            numero = solicitarNumero(entrada);

        } else{
            numero = Double.parseDouble(deleteSpace(cadena));
        }
        return numero;
    }


}
