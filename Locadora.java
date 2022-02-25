package aula01locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {

    public int indiceD;
    public int indiceF;
    ArrayList<Disco> discos;
    ArrayList<Filme> filmes;
    public Locadora() {
        discos = new ArrayList<Disco>(2);
        filmes = new ArrayList<Filme>(2);
        this.indiceD = 0;
        this.indiceF = 0;
    }

    public void novoDisco(Disco d){
       discos.add(d);
       this.indiceD++;
       
    }
    
    public void listarDiscos(Disco d ){
      d.ListaInformacao();
       
    }
    public void novoFilme(Filme f){
        filmes.add(f);
        this.indiceF++;
    }
    public void listarFilme(Filme f){
      f.ListaInformacao();
       
    }
}
