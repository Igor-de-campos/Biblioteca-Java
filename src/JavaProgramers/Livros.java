/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaProgramers;

/**
 *
 * @author igorc
 */
public class Livros {
       String nome;
     String genero;

    public Livros(String nome, String marca) {
        this.nome = nome;
        this.genero = marca;
    }
    
    public Livros() {
        
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    

    
}
