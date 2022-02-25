package aula01locadora;

public class Disco extends Item {

    public String nomeDoArtista;
    public int qqtdDeFaixas;
    public String midia;

    public Disco(String titulo, String anoDeLançamento, String comentario) {
        super(titulo, anoDeLançamento, comentario);
    }

    public Disco(String nomeDoArtista, int qqtdDeFaixas, String midia, String titulo, String anoDeLançamento, String comentario) {
        super(titulo, anoDeLançamento, comentario);
        this.nomeDoArtista = nomeDoArtista;
        this.qqtdDeFaixas = qqtdDeFaixas;
        this.midia = midia;
    }

    //public abstract String ListaInformacao();
    @Override
    public void ListaInformacao() {
        System.out.println("---------------------------------------");
        System.out.println("Informações do disco");
        System.out.println(" ");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Ano de lançamento: " + this.getAnoDeLançamento());
        System.out.println("Comentários: " + this.getComentario());
        System.out.println("Nome do artista: " + this.getNomeDoArtista());
        System.out.println("Quantidade de faixas: " + this.getQqtdDeFaixas());
        System.out.println("Mídia: " + this.getMidia());

        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomeDoArtista() {
        return nomeDoArtista;
    }

    public void setNomeDoArtista(String nomeDoArtista) {
        this.nomeDoArtista = nomeDoArtista;
    }

    public int getQqtdDeFaixas() {
        return qqtdDeFaixas;
    }

    public void setQqtdDeFaixas(int qqtdDeFaixas) {
        this.qqtdDeFaixas = qqtdDeFaixas;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

}
