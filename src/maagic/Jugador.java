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
import java.util.function.Consumer;


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
                int coste = scBaraja.nextInt();
                Carta c = new Carta(vida, ataque, coste);
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
        if (baraja.size() >= 3) {
            mano.add(baraja.get(baraja.size() - 1));
            mano.add(baraja.get(baraja.size() - 1));
            mano.add(baraja.get(baraja.size() - 1));
        } else {
            Collections.shuffle(descarte);
            baraja.addAll(baraja.size(), descarte);
        }
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

    //Estos metodos igual se cambian para tener uno especializado para cada tipo
    //de movimiento mano->descarte mano->mesa mesa->descarte descarte->baraja
    public void moverCartaDescarte(int carta, ArrayList<Carta> origen, ArrayList<Carta> destino) {
        Carta o = origen.get(carta);
        origen.remove(carta);
        destino.add(o);
    }

  

    public void moverCartaMesa(int cartaOrigen, int cartaDestino, ArrayList<Carta> origen, Carta[] destino) {
        Carta o = origen.get(cartaOrigen);
        origen.remove(cartaOrigen);
        destino[cartaDestino] = o;
    }


    public void ganarMana(Carta c) {
 mana += Math.round((float) c.getCoste() / 2f);
    }

    public void recibirAtaque(Carta c) {
    }
    
    public void vidacarta(Carta c, int CartaVolberBaraja) {
          CartaVolberBaraja = c.getVida();
        CartaVolberBaraja = c.getAtaque();
        if (baraja.contains(CartaVolberBaraja)) {
            baraja.remove(CartaVolberBaraja);
        } else if (c.getVida() == 0) {
            baraja.indexOf(CartaVolberBaraja);
        } else {
            vida -= c.getAtaque();

        }
    }


    }


      

