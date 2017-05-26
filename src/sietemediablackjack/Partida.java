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
public class Partida {
    Jugador jugador;
    Jugador banca;
    float limite;
    
    public Partida(Jugador j, Jugador b, TiposDeBaraja baraja){
        this.jugador = j;
        this.banca = b;
        this.limite = baraja.getLimite();
    }
    
    public String devuelveGanador(){
        return this.quienEstaMasCercaDeSieteYMedia();
    }

    public Jugador getJugador() {
        return this.jugador;
    }

    public Jugador getBanca() {
        return this.banca;
    }

    public float getLimite() {
        return this.limite;
    }
    
    private boolean ningunoSePasaOSePasanLosDos(){
        if((jugador.devuelveSumaCartas() < limite || jugador.devuelveSumaCartas() == limite) && 
                (banca.devuelveSumaCartas() < limite || banca.devuelveSumaCartas() == limite)){
            return true;
        } else if(jugador.devuelveSumaCartas() > limite && banca.devuelveSumaCartas() > limite){
            return true;
        }else {
            return false;
        }
    }
    
    public Carta obtenerOtraCarta(GestoraDeBarajas g){
        return g.devuelveCartaAleatoria();
    }
    
    private String quienEstaMasCercaDeSieteYMedia(){
        if(this.ningunoSePasaOSePasanLosDos() && Math.abs(limite - jugador.devuelveSumaCartas()) < Math.abs(limite - banca.devuelveSumaCartas())){
            return jugador.getNombre();
        } else if (this.ningunoSePasaOSePasanLosDos() && Math.abs(limite - jugador.devuelveSumaCartas()) > Math.abs(limite - banca.devuelveSumaCartas())){
            return banca.getNombre();
        } else if (sePasaElJugadorYLaBancaNo()){
            return banca.getNombre();
        } else if(sePasaLaBancaYElJugadorNo()){
            return jugador.getNombre();
        } else {
            return "Empate";
        }
    }
    
    private boolean sePasaElJugadorYLaBancaNo(){
        if(jugador.devuelveSumaCartas() > limite && banca.devuelveSumaCartas() <= limite){
            return true;
        } else {
            return false;
        }
    }
    
    private boolean sePasaLaBancaYElJugadorNo(){
        if(jugador.devuelveSumaCartas() <= limite && banca.devuelveSumaCartas() > limite){
            return true;
        } else {
            return false;
        }
    }
}
