/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic;

import maagic.interfaz.MainInterfaz;

/**
 *
 * @author otorradomiguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancio los jugadores. Hay que modificarlo para que cojan la baraja de la BD
        Jugador j1=new Jugador("barajas/Cartas.txt");
        Jugador j2=new Jugador("barajas/Cartas.txt");
        //Se barajan ambos mazos
        j1.barajar();
        j2.barajar();
        //Instancio el interfaz grafico
        MainInterfaz mI=new MainInterfaz();
    }
    
}
