/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic;

import javax.swing.JPanel;


/**
 *
 * @author Orom
 */
public class  Carta extends JPanel  {
 
    //Aki iran las variables ataque,defensa,coste, y en caso de haberlos habilidades
//especiales o asi
    private int vida;
    private int ataque;
    private int coste;
    private int id;
    private String nombre;

    public void setVida(int cartaAtaque) {
        this.vida -= cartaAtaque;
    }

    public Carta(int vida, int ataque, int coste,int id,String nombre) {
        this.vida = vida;
        this.ataque = ataque;
        this.coste = coste;
        this.id=id;
        this.nombre=nombre;
    }
    public String getnombre(){
    return nombre;
    }
    public int getid(){
    return id;
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
        c.setVida(this.ataque);
        this.vida -= c.getAtaque();
    }

}
