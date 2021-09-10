public class Videojuego implements Entregable {
    String titulo;
    double horasEstimadas;
    boolean entregado;
    String genero;
    String compañia;

    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    public Videojuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCompañia() {
        return this.compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Título:" + this.titulo + "- Creador:" + this.compañia;
    }


    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        return 1;
    }
}
