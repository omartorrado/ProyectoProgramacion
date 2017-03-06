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
        //Creamos los 2 jugadores con sus barajas (en este caso la de prueba)
        Jugador j1=new Jugador("./src/maagic/Cartas.txt");
        Jugador j2=new Jugador("./src/maagic/Cartas.txt");
        //Se barajan ambos mazos
        j1.barajar();
        j2.barajar();
        //Inicia el turno del jugador 1
        j1.cogerMano();
        //Elige que carta de jugar de su mano
        j1.moverManoMesa(j1.elegirCartaOrigen(),j1.elegirCartaDestino());
        j1.moverManoMesa(j1.elegirCartaOrigen(),j1.elegirCartaDestino());
        j1.moverManoMesa(j1.elegirCartaOrigen(),j1.elegirCartaDestino());
        //Se realizan los ataques
        //(Escribir metodos para realizar el ataque, que ocurre si la carta pierde toda su vida,
        //que el jugador reciba daño si no hay carta enfrente)
        //Empieza el turno del jugador 2
    }
    
}
