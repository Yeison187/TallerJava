public class Serie {
    String título;
    int numeroTemporadas;
    boolean entregado;
    String genero;
    String creador;

    public Serie(){
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
        this.título = "";
    }
    public Serie(String titulo, String creador){
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
        this.título = titulo;
    }
    public Serie(String titulo, String creador, String genero,int numeroTemporadas ){
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
        this.título = titulo;
    }

    public int getNumeroTemporadas(){
        return this.numeroTemporadas;
    }
    public String getGenero(){
        return this.genero;
    }

    public String getCreador(){
        return this.creador;
    }
    public String getTítulo(){
        return this.título;
    }

    public void setNumeroTemporadas(int numeroTemporadas){
        this.numeroTemporadas = numeroTemporadas;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setCreador(String creador){
         this.creador = creador;
    }
    public void setTítulo(String título){
        this.título = título;
    }
    @Override
    public String toString() {
        return "Título:" + this.título  + "- Creador:" + this.creador;
    }





}
