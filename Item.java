package aula01locadora;

public abstract class Item {

    public String titulo;
    public String anoDeLançamento;
    public String comentario;

    public abstract void ListaInformacao();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(String anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Item(String titulo, String anoDeLançamento, String comentario) {
        this.titulo = titulo;
        this.anoDeLançamento = anoDeLançamento;
        this.comentario = comentario;
    }
}
