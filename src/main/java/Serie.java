public class Serie implements Entregable {
    String titulo;
    int numeroTemporadas;
    boolean entregado;
    String genero;
    String creador;

    public Serie() {
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
        this.titulo = "";
    }

    public Serie(String titulo, String creador) {
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
        this.titulo = titulo;
    }

    public Serie(String titulo, String creador, String genero, int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return this.numeroTemporadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCreador() {
        return this.creador;
    }

    public String getTítulo() {
        return this.titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setTítulo(String título) {
        this.titulo = título;
    }

    @Override
    public String toString() {
        return "Título:" + this.titulo + "- Creador:" + this.creador;
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
        int estado = -1;

        return estado;
    }

}
