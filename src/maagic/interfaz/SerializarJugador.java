/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import maagic.Jugador;

/**
 *
 * @author dfernandezrivas
 */
public class SerializarJugador {
    public static void leerjugadores() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream leer=new FileInputStream("Jugadores/Jugador");
        try (ObjectInputStream jugador = new ObjectInputStream(leer)) {
            int i= jugador.readInt();
            Integer Vida = (Integer) jugador.readObject();
            Integer Mana = (Integer) jugador.readObject();
//      Date date = (Date) jugador.readObject();
//      jugador.close();

        }
        catch(IOException e){
            System.out.printf("Los objetos se fueron de paseo", e.getMessage());
        
        }
}

    public static void escribirjugadores() throws FileNotFoundException, IOException{
            Jugador jugador;
        jugador = new Jugador("barajas/");
        try{
        FileOutputStream escribir=new FileOutputStream("Jugadores/Jugador");
            ObjectOutputStream ju1 = new ObjectOutputStream(escribir);
            ju1.writeObject(jugador.getVida());
            ju1.writeObject(jugador.getMana());
            ju1.putFields();
            ju1.reset();
        }
        catch(IOException e){
        
        System.out.printf("El archivo se fue de paseo", e.getMessage());
        
        }
           
}
}