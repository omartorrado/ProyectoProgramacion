/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Orom
 */
public class Jugador {

    //Aki irian variables del jugador (mano,baraja,descarte,vida,mana,...)
    //Tambien se instanciarian aqui mano, descarte, y baraja
    private ArrayList<Carta> mano;
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> descarte;
    private int vida = 20;
    private int mana = 0;

    public void getMano() {
        mano.add(baraja.get(baraja.size() - 1));
        mano.add(baraja.get(baraja.size() - 1));
        mano.add(baraja.get(baraja.size() - 1));
    }
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    

}
