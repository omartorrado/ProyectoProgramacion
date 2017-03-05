/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic;

import java.io.File;
import java.io.FileNotFoundException;
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
    public Jugador(String fileBaraja) {
        Scanner scBaraja;
        File miBaraja=new File(fileBaraja);
        System.out.println("wtf");
        try {
            System.out.println("wtf2");
            scBaraja = new Scanner(miBaraja);
             System.out.println("wtf3");
            while (scBaraja.hasNextLine()) {
                 System.out.println("wtf4");
                int cvida = scBaraja.nextInt();
                 System.out.println("wtf5");
                int cataque = scBaraja.nextInt();
                int ccoste = scBaraja.nextInt();
                 System.out.println("wtf6");
                 System.out.println(cvida+","+cataque+","+ccoste);
                Carta c = new Carta(cvida, cataque, ccoste);
                 System.out.println("wtf7");
                this.baraja.add(c);
                 System.out.println("wtf8");
            }
             System.out.println("wtf9");
            scBaraja.close();
                   } catch (FileNotFoundException e) {
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
    public void cogerMano() {
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
        //Test
        for(int i=0;i<3;i++){
        System.out.println("Vida: "+mano[i].getVida()+" Ataque: "+mano[i].getAtaque()+" Coste: "+mano[i].getCoste());
        }
        //End test
    }

    public void barajar() {
        Collections.shuffle(baraja);
        //Test
        for (Carta c : baraja) {
            System.out.println("Vida: "+c.getVida()+" Ataque: "+c.getAtaque()+" Coste: "+c.getCoste());
        }
        //End test
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
