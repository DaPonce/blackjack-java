/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sietemediablackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dani
 */
public class GestoraDeBarajas extends ArrayList<Carta>{
    private TiposDeBaraja laBaraja;
    
    public GestoraDeBarajas(TiposDeBaraja baraja){
        this.laBaraja = baraja;
        definirCartas();
    }
    
    public void definirCartas(){
        for(int i = 0; i < laBaraja.numeroDeCartasDeLaBaraja(); i++){
            this.add(new Carta(laBaraja.archivosDeImagen()[i], laBaraja.valores()[i]));
        }
        Collections.shuffle(this);
    }
    
    public Carta devuelveCartaAleatoria(){
        if(this.isEmpty()){
            return null;
        }
        Carta c = this.get(0);
        this.remove(0);
        return c;
    }
}