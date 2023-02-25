/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaProgramers;

import java.util.ArrayList;

/**
 *
 * @author igorc
 */
public class ControlaLivros {
    
    
     private final ArrayList<Livros> livros = new ArrayList<>();

   
public boolean salvar(Livros v) {
    if(v != null) {
         livros.add(v);
        return true;
    }else{
        return false;
    }
}
public ArrayList<Livros> retornaTodos(){
    return livros;
}

    
}
