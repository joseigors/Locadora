package aula01locadora;

public class Filme extends Item {

    public Filme(String nomeDoDiretor, int duracao, String genero, String titulo, String anoDeLançamento, String comentario) {
        super(titulo, anoDeLançamento, comentario);
        this.nomeDoDiretor = nomeDoDiretor;
        this.duracao = duracao;
        this.genero = genero;
    }

    public Filme(String titulo, String anoDeLançamento, String comentario) {
        super(titulo, anoDeLançamento, comentario);
    }

    @Override
    public void ListaInformacao() {
        System.out.println("---------------------------------------");
        System.out.println("Informações do filme");
        System.out.println(" ");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Ano de lançamento: " + this.getAnoDeLançamento());
        System.out.println("Comentários: " + this.getComentario());
        System.out.println("Diretor: " + this.getNomeDoDiretor());
        System.out.println("Duração: " + this.getDuracao());
        System.out.println("Gênero: " + this.getDuracao());

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String nomeDoDiretor;
    public int duracao;
    public String genero;

    public String getNomeDoDiretor() {
        return nomeDoDiretor;
    }

    public void setNomeDoDiretor(String nomeDoDiretor) {
        this.nomeDoDiretor = nomeDoDiretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
