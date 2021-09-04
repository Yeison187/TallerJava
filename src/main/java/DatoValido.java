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
        System.out.println("");
        System.out.println("******************  Menú  *****************************");
        System.out.println("Para acceder a cada ejercicio digita el número del item");
        System.out.println("1. Numero mayor, ya definidos");
        System.out.println("2. Número mayor, enviando parametros");
        System.out.println("3. Área del círculo");
        System.out.println("4. Digita cero en caso de querer cerrar el programa");
        System.out.println("5. Números pares e impares con while");
        System.out.println("6. Números pares e impares con for");

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
