/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
    private Carta[] mesa = new Carta[3];
    private int vida = 20;
    private int mana = 0;

    //Constructor
    public Jugador(File baraja) {
        try {
            Scanner scBaraja = new Scanner(baraja);
            while (scBaraja.hasNextLine()) {
                int vida = scBaraja.nextInt();
                int ataque = scBaraja.nextInt();
                int defensa = scBaraja.nextInt();
                Carta c = new Carta(vida, ataque, defensa);
                this.baraja.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error. Baraja no encontrada");
        }

    }
    //Getters

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    //Metodos del jugador
    public void getMano() {
        mano.add(baraja.get(baraja.size() - 1));
        mano.add(baraja.get(baraja.size() - 1));
        mano.add(baraja.get(baraja.size() - 1));
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void jugarCarta(int i) {
        mano.get(i);
    }

    //Ver como se integra con el display, es posible que se cambie
    public void turno() {
        mana += 1;
        while (mano.size() > 0) {

        }
    }

    public void moverCarta(ArrayList a, ArrayList b) {

    }

    public void ganarMana(Carta c) {

    }

    public void recibirAtaque(Carta c) {

    }
}
