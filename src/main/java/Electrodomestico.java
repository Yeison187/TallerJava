public class Electrodomestico {
    protected double preciBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.preciBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(double precio, double peso) {
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.preciBase = precio;
        this.peso = peso;
    }

    public Electrodomestico(String color, char consumoEnergetico, double precio, double peso) {

        this.preciBase = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public String getColor() {
        return this.color;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public double getPreciBase() {
        return this.preciBase;
    }

    public double getPeso() {
        return this.preciBase;
    }

    private void comprobarColor(String color) {
        if (!color.equals("blanco"))
            if (!color.equals("azul"))
                if (!color.equals("negro"))
                    if (!color.equals("gris"))
                        if (!color.equals("rojo"))
                            this.color = "blanco";
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (letra != 'A')
            if (letra != 'B')
                if (letra != 'C')
                    if (letra != 'D')
                        if (letra != 'E')
                            if (letra != 'F')
                                this.consumoEnergetico = 'F';

    }

    public double precioFinal() {
               return (precioPorConsumo() + precioPorTamaño() + this.preciBase);
    }

    public int precioPorConsumo() {
        if (this.consumoEnergetico == 'A')
            return 100;
        else if (this.consumoEnergetico == 'B')
            return 80;
        else if (this.consumoEnergetico == 'C')
            return 60;
        else if (this.consumoEnergetico == 'D')
            return 50;
        else if (this.consumoEnergetico == 'E')
            return 30;
        return 10;
    }

    public int precioPorTamaño() {
        if (this.peso > 0 && this.peso < 20)
            return 10;
        if (this.peso > 19 && this.peso < 50)
            return 50;
        if (this.peso > 49 && this.peso < 80)
            return 80;
        if (this.peso > 79)
            return 100;
        return 10;
    }


}
