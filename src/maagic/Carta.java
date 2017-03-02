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
public class Carta {
    //Aki iran las variables ataque,defensa,coste, y en caso de haberlos habilidades
//especiales o asi

    private int vida;
    private int ataque;
    private int coste;

    public Carta(int vida, int ataque, int coste) {
        this.vida = vida;
        this.ataque = ataque;
        this.coste = coste;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getCoste() {
        return coste;
    }

    public void ataque(Carta c) {
        c.vida -= this.ataque;
        this.vida -= c.getAtaque();
    }

}
