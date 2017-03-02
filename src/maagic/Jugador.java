/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic;

/**
 *
 * @author Orom
 */
public class Jugador {

    //Aki irian variables del jugador (mano,baraja,descarte,vida,mana,...)
    //Tambien se instanciarian aqui mano, descarte, y baraja
    private Mano mano;
    private Baraja baraja;
    private Descarte descarte;
    private int vida = 20;
    private int mana = 0;

    //Metodo repartir
    public void repartirX3() {
        mano.addCarta(baraja.getCarta());
        mano.addCarta(baraja.getCarta());
        mano.addCarta(baraja.getCarta());
    }
    
    public Carta jugarCarta(int c){
        return mano.getCarta(c);
    }
}
