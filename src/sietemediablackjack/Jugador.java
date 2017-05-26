/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sietemediablackjack;

import java.util.ArrayList;

/**
 *
 * @author dam116
 */
public class Jugador extends ArrayList<Carta>{
    private String nombre;
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public float devuelveSumaCartas(){
        float valorTotal = 0.0f;
        for(Carta c:this){
            valorTotal += c.getValor();
        }
        return valorTotal;
    }
}