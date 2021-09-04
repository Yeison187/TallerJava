
public class Persona {
    private String nombre = "";
    private int edad;
    private long DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = 0;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, long DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;


    }

    private byte calcularIMC() {
        final byte pesoIdialA = -1;
        final byte pesoIdealB = 0;
        final byte pesoIdealC = 1;
        double imc = 0;

        imc = this.peso / (Math.pow(this.altura,2));

        if (imc < 20){
            return pesoIdialA;
        }else if(imc >= 20 && imc<=25){
            return pesoIdealB;
        }
        return pesoIdealC;

    }

    private boolean esMayorDeEdad(){
        if (this.edad >= 18){
            return true;
        }
       return false;
    }
}
