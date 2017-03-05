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
public class Maagic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Main. Aki instanciamos juego e interfaz
        //Jugador j1=new Jugador("C:/Users/Orom/Documents/NetBeansProjects/Maagic/src/maagic/Cartas.txt");
        Jugador j1=new Jugador("./src/maagic/Cartas.txt");
        j1.barajar();
        System.out.println(" ");
        j1.cogerMano();
        System.out.println(" ");
        j1.cogerMano();
        System.out.println(" ");
        j1.cogerMano();
    }
    
}
