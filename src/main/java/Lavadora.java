public class Lavadora extends Electrodomestico{
    double carga;

    public Lavadora(){
        super();
        this.carga = 5;
    }

    public Lavadora(double precio, double peso){
        super(precio,peso);
        this.carga = 5;
    }

    public Lavadora(int carga){
        super();
        this.carga = carga;
    }

    public double getCarga(){
        return this.carga;
    }


    public double precioFinal(){
        if (carga >= 30)
            return super.precioFinal() + 50;
        return super.precioFinal();
    }

}
