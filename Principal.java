/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Disco d = new Disco("Vários Artistas", 12, "CD", "Samba Social Clube 5", " 2014", "Vários Sambas");
        Disco d2 = new Disco("ivete", 14, "DVD", " PODE ENTRAR ", " 2009", "IVETE E CONVIDADOS");

        Filme f = new Filme("Raja Gosnell", 140, "Animação", "Smurfs 2", "2013", "Gargamel cria a versão malvada dos Smurfs");
        Filme f2 = new Filme("Simon West", 210, "Ação", "Os mercenários", "2012", "De volta ao mundo");
        Locadora loc = new Locadora();
        loc.novoDisco(d);
        loc.listarDiscos(d);
        loc.novoDisco(d2);
        loc.listarDiscos(d2);
        loc.novoFilme(f);
        loc.listarFilme(f);
        loc.novoFilme(f2);
        loc.listarFilme(f2);
    
        
        
    }
}
