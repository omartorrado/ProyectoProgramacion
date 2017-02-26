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
public class Baraja {
    //Esto será la baraja de cada jugador, ya veremos como construirla, y si puedes
    //modificarla o no
    //Será un arraylist e incluira los metodos para coger carta y barajar
    private ArrayList <Carta> baraja;
    
    //devuelve la ultima carta del arraylist baraja
    public Carta getBaraja(){
        return baraja.get(baraja.size()-1);
    }
}
