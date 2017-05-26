/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sietemediablackjack;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Dani
 */
public class Carta extends HashMap<ClavesCarta,Object> implements Serializable{
    
    public Carta(String img, float val){
        this.put(ClavesCarta.IMAGEN, img);
        this.put(ClavesCarta.VALOR, val);
    }
    
    public String getImagen(){
        return (String) this.get(ClavesCarta.IMAGEN);
    }
    
    public float getValor(){
        return (float) this.get(ClavesCarta.VALOR);
    }
    
    public void setValor(float valor){
        this.put(ClavesCarta.VALOR, valor);
    }
}
