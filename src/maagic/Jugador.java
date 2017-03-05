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
    /*
    private ArrayList<Carta> mano;
    //cambio mano a un array, para no preocuparnos de que cambie de tamaño
    //al tratarse de un array de objetos Carta, cuando no hay nada en una
    //posicion devuelve null, lo que nos evita tener la "carta vacia" para rellenar
    //cuando no hay nada
     */
    private Carta[] mano = new Carta[3];
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
                int cvida = scBaraja.nextInt();
                int cataque = scBaraja.nextInt();
                int ccoste = scBaraja.nextInt();
                Carta c = new Carta(cvida, cataque, ccoste);
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
            mano[0] = baraja.get(baraja.size() - 1);
            mano[1] = baraja.get(baraja.size() - 1);
            mano[2] = baraja.get(baraja.size() - 1);
        } else {
            Collections.shuffle(descarte);
            baraja.addAll(baraja.size(), descarte);
            mano[0] = baraja.get(baraja.size() - 1);
            mano[1] = baraja.get(baraja.size() - 1);
            mano[2] = baraja.get(baraja.size() - 1);
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void jugarCarta(int i) {

    }

    //Ver como se integra con el display, es posible que se cambie
    public void turno() {
        mana += 1;

    }

    //Estos metodos igual se cambian para tener uno especializado para cada tipo
    //de movimiento mano->descarte mano->mesa mesa->descarte descarte->baraja.
    //descarte->baraja ya lo hace el metodo getMano()
    /*
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
     */
    public void moverManoMesa(int carta, int mesa) {
        if (this.mesa[mesa] == null) {
            this.mesa[mesa] = this.mano[carta];
            this.mano[carta] = null;
        }
    }

    public void moverManoDescarte(int carta) {
        descarte.add(mano[carta]);
        mano[carta] = null;
    }

    public void moverMesaDescarte(int carta) {
        descarte.add(mesa[carta]);
        mesa[carta] = null;
    }

    public void ganarMana(Carta c) {
        mana += Math.round((float) c.getCoste() / 2f);
    }

    public void recibirAtaque(Carta c) {
        vida-=c.getAtaque();
    }

    /*
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
    */
}
