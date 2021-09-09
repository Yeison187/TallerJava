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
            System.out.println(" ");
            System.out.print("Digite un numero, según el item a consultar: ");
            opcionMenu = entrada.nextLine();
            System.out.println(" ");

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

                        System.out.println(ejercicio.numeroMayor(numero1, numero2));

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
                        ejercicio.esCero(entrada);
                        break;

                    case "8":
                        System.out.print("Digite el dia de la semana: ");
                        String diaSemana = entrada.nextLine();
                        ejercicio.diaLaboral(diaSemana);

                        break;

                    case "9":

                        System.out.println("Digite una frase");
                        String frase = entrada.nextLine();
                        System.out.println((ejercicio.reemplazarAporE()).concat(frase));
                        break;

                    case "10":
                        System.out.print("Digite una frase: ");
                        String cadena = entrada.nextLine();
                        System.out.println("Frase sin espacios: " + datoValido.deleteSpace(cadena));
                        break;

                    case "11":
                        System.out.print("Digite una frase: ");
                        String cadena2 = entrada.nextLine();
                        System.out.println("El tamaño de la frase contando los espacios es: " + cadena2.length());
                        System.out.println("La vocal 'a' se repite: " + ejercicio.contarVocal(cadena2, 'a'));
                        System.out.println("La vocal 'e' se repite: " + ejercicio.contarVocal(cadena2, 'e'));
                        System.out.println("La vocal 'i' se repite: " + ejercicio.contarVocal(cadena2, 'i'));
                        System.out.println("La vocal 'o' se repite: " + ejercicio.contarVocal(cadena2, 'o'));
                        System.out.println("La vocal 'u' se repite: " + ejercicio.contarVocal(cadena2, 'u'));


                        break;

                    case "12":

                        System.out.print("Digite una frase: ");
                        String cadenaUno = entrada.nextLine();
                        System.out.print("Digite otra frase: ");
                        String cadenaDos = entrada.nextLine();
                        System.out.println("Son iguales: " + ejercicio.isEqualCadena(cadenaUno, cadenaDos));
                        break;

                    case "13":
                        System.out.print("Fecha actual: ");
                        ejercicio.mostrarFechaActual();
                        break;


                    case "14":
                        double number = datoValido.solicitarNumero(entrada);
                        System.out.println("El mensaje esta en una pequeña ventana, minimiza y ve el resultado");
                        ejercicio.imprimirNumerosConSalto(number);

                        break;


                    case "15":
                        ejercicio.getionCinematografica(entrada);
                        break;

                    case "16":
                        System.out.println("Digite su nombre ");
                        String nombre = entrada.nextLine();
                        System.out.println("Digite su edad ");
                        int edad = (int) datoValido.solicitarNumero(entrada);
                        System.out.println(" Digite la letra segun su sexo: M en caso de ser mujer y H de ser hombre");
                        char sexo = entrada.nextLine().toUpperCase().charAt(0);
                        System.out.println(" Digite su peso ");
                        double peso = datoValido.solicitarNumero(entrada);
                        System.out.println(" Digite su altura ");
                        double altura = datoValido.solicitarNumero(entrada);

                        Persona contructorUno = new Persona(nombre, edad, sexo, peso, altura);
                        Persona contructorDos = new Persona(nombre, edad, sexo);
                        Persona contructorTres = new Persona();

                        contructorTres.setEdad(edad);
                        contructorTres.setNombre(nombre);
                        contructorTres.setPeso(peso);
                        contructorTres.setAltura(altura);
                        contructorTres.setSexo(sexo);

                        contructorDos.setPeso(peso);
                        contructorDos.setAltura(altura);

                        byte IMC1 = contructorTres.calcularIMC();
                        byte IMC2 = contructorDos.calcularIMC();
                        byte IMC3 = contructorUno.calcularIMC();

                        if (IMC1 == -1 && IMC2 == -1 && IMC3 == -1) {
                            System.out.println("Tiene peso ideal");
                        } else if (IMC1 == 0 && IMC2 == 0 && IMC3 == 0) {
                            System.out.println("Esta por debajo del peso ideal");
                        } else if (IMC1 == 1 && IMC2 == 1 && IMC3 == 1) {
                            System.out.println("Esta por encima del peso ideal");
                        }


                        System.out.println("Este es el toString del primer objeto: "
                                + contructorTres.mostarObjesto(contructorUno));
                        System.out.println("Este es el toString del segundo objeto: "
                                + contructorTres.mostarObjesto(contructorDos));
                        System.out.println("Este es el toString del tercer objeto: "
                                + contructorTres.mostarObjesto(contructorTres));

                        break;

                    case "17":
                        Electrodomestico arrayObjetos[] = new Electrodomestico[10];

                        arrayObjetos[0] = new Television(40,false);
                        arrayObjetos[1] = new Television(30,true);
                        arrayObjetos[2] = new Television(50,true);
                        arrayObjetos[3] = new Television(30,false);
                        arrayObjetos[4] = new Television();
                        arrayObjetos[5] = new Lavadora(30);
                        arrayObjetos[6] = new Lavadora(40);
                        arrayObjetos[7] = new Lavadora(20);
                        arrayObjetos[8] = new Lavadora();
                        arrayObjetos[9] = new Lavadora();

                        double total = 0;
                        double totalTv = 0;
                        double totalLavadoras = 0;
                        for (int i = 0; i < arrayObjetos.length; i++) {
                            total += arrayObjetos[i].precioFinal();
                                      if (arrayObjetos[i].getClass().getName() == "Television"){
                                          totalTv += arrayObjetos[i].precioFinal();
                                      }else if(arrayObjetos[i].getClass().getName() == "Lavadora"){
                                          totalLavadoras += arrayObjetos[i].precioFinal();
                                      }

                        }
                        System.out.println("Total en lavadoras " + totalLavadoras);
                        System.out.println("Total en TV " + totalTv);
                        System.out.println("Total entre TV y Lavadoras "+total);

                        break;

                    case "18":
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
