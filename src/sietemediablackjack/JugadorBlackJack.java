/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sietemediablackjack;

/**
 *
 * @author dam116
 */
public class JugadorBlackJack extends Jugador{

    public JugadorBlackJack(String n) {
        super(n);
    }
    
    @Override
    public boolean add(Carta elemento){
        if(elemento.getValor() == 11f && (this.devuelveSumaCartas() + 11f) > 21){
            elemento.setValor(1);
        }
        super.add(elemento);
        return true;
    }
}
