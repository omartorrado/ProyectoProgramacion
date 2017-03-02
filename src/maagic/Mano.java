/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic;

import java.util.ArrayList;

/**
 *
 * @author Orom
 */
public class Mano {

    //Aki tiene que haber un arraylist con las cartas de la mano, y los metodos
    //para quitar, meter cartas en la mano
    private ArrayList<Carta> mano;

    public ArrayList<Carta> getMano() {
        return mano;
    }
    
    public Carta getCarta(int i){
        return mano.get(i);
    }

    public void addCarta(Carta c){
        mano.add(c);
    }

   
}
