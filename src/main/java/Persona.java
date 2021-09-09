
public class Persona {
    private String nombre = "";
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
        setDNI();

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        setDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        setDNI();


    }

    public byte calcularIMC() {
        final byte pesoIdial = -1;
        final byte bajoPeso = 0;
        final byte sobrePeso = 1;
        double imc = 0;

        imc = this.peso / (Math.pow(this.altura, 2));

        if (imc < 20) {
            return pesoIdial;
        } else if (imc >= 20 && imc <= 25) {
            return bajoPeso;
        }
        return sobrePeso;

    }

    private boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        }
        return false;
    }

    private void comprobarSexo() {
        if (this.sexo != 'H') {
            if (this.sexo != 'M') {
                this.sexo = 'H';
            }
        }

    }

    private String mostarObjeto(Object objeto) {
        return objeto.toString();
    }

    private String generaDNI() {
        String letraDNI[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "L", "Z", "S", "Q",
                "V", "H", "L", "C", "K", "E"};
        int numeroAleatorio = (int) (Math.random() * 999999999);

        return String.valueOf(numeroAleatorio).concat(letraDNI[numeroAleatorio % 23]);
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSexo (char sexo){
        this.sexo = sexo;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){this.altura = altura; }

    public void setDNI(){this.DNI = generaDNI();}

    public String mostarObjesto(Object objeto){
        return mostarObjeto(objeto);
    }

}
