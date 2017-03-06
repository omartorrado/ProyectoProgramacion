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
        while(j1.getVida()>0&&j2.getVida()>0){
        //Inicia el turno del jugador 1
        j1.cogerMano();
        //Elige que carta de jugar de su mano
        do{
        j1.elegirCarta();
        j1.printMesa(j2);
        }
        while(j1.getMano(0)!=null&&j1.getMano(1)!=null&&j1.getMano(2)!=null);
        //Se realizan los ataques
        j1.realizarAtaque(j2);
        if(j2.getVida()<1){
            break;
        }
        //Empieza el turno del jugador 2
        j2.cogerMano();
        //Elige que carta de jugar de su mano
        do{
        j2.elegirCarta();
        j2.printMesa(j1);
        }
        while(j2.getMano(0)!=null&&j2.getMano(1)!=null&&j2.getMano(2)!=null);
        //Se realizan los ataques
        j2.realizarAtaque(j1);
        }
        
        //Test
        if(j1.getVida()<1){
            System.out.println("Jugador 1! Has Perdido!");
        }
        if(j2.getVida()<1){
            System.out.println("Jugador 2! Has Perdido!");
        }
        //End Test
    }
    
}
