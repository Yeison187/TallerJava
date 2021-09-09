public class Television extends Electrodomestico {
    int resolucion;
    boolean TDT;
    public Television(){
        super();
        this.resolucion = 20;
        this.TDT = false;
    }

    public Television(double precio, double peso){
        super(precio,peso);
        this.resolucion = 20;
        this.TDT = false;
    }

    public Television(int resolucion, boolean TDT){
        super();
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double precioFinal(){
        double precio = 0;

        if (this.resolucion >= 40){
            precio = (super.precioFinal() * 0.30);
        }
        if (this.TDT){
            precio = precio + 50;
        }
        return super.precioFinal() + precio;
    }




}
