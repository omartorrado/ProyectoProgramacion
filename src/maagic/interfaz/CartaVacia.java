/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import GUI.DimensionPantalla;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;
import maagic.Main;

/**
 *
 * @author otorradomiguez
 */
public class CartaVacia extends JPanel {

    public JLabel fondoVacio;

    public CartaVacia() {
        fondoVacio = new JLabel();
        this.setSize(160, 200);
        fondoVacio.setSize(160, 200);
        DimensionPantalla.resizeImagen("/maagic/img/fondoCarta.png", fondoVacio);
        //fondoVacio.setHorizontalAlignment(LEFT);
        this.add(fondoVacio);
        //this.setAlignmentX(1f);
        fondoVacio.setAlignmentY(0.5f);
        //fondoVacio.setVerticalAlignment(CENTER);
        fondoVacio.setPreferredSize(new Dimension(160, 200));
        //this.setBorder(BorderFactory.createLineBorder(Color.blue));

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Juego tempJuego = (Juego) fondoVacio.getParent().getParent().getParent().getParent();
                System.out.println("Carta vacia click");
                if (tempJuego.cartaSeleccionada != -1 && tempJuego.turnoJ1 && tempJuego.panelManoJ1.isFocusable()) {
                    if (Main.j1.getMana() >= Main.j1.getMano(tempJuego.cartaSeleccionada).getCoste()) {
                        System.out.println("Es el turno del Jugador 1");
                        System.out.println(tempJuego.cartaSeleccionada + ", " + fondoVacio.getParent().getParent().getComponentZOrder(fondoVacio.getParent()));
                        Main.j1.moverManoMesa(tempJuego.cartaSeleccionada, fondoVacio.getParent().getParent().getComponentZOrder(fondoVacio.getParent()));
                        Main.repintar();
                        tempJuego.cartaSeleccionada = -1;
                        
                    } else {
                        int opcion=JOptionPane.showConfirmDialog(tempJuego, "No tienes suficiente maná.\n ¿Quieres cambiar esta carta por " + (Main.j1.getMano(tempJuego.cartaSeleccionada).getCoste() / 2) + " de maná?", "", YES_NO_OPTION);
                        if(opcion==YES_OPTION){
                            System.out.println("El jugador 1 gana mana, tiene "+Main.j1.getMana());
                            Main.j1.ganarMana(tempJuego.cartaSeleccionada);
                            System.out.println("El jugador 1 gana mana, tiene "+Main.j1.getMana());
                            Main.repintar();
                        }
                    }
                } else if (tempJuego.cartaSeleccionada != -1 && tempJuego.turnoJ1 == false&& tempJuego.panelManoJ2.isFocusable()) {
                    if (Main.j2.getMana() >= Main.j2.getMano(tempJuego.cartaSeleccionada).getCoste()) {
                        System.out.println("Es el turno del jugador 2");
                        System.out.println(tempJuego.cartaSeleccionada + ", " + fondoVacio.getParent().getParent().getComponentZOrder(fondoVacio.getParent()));
                        Main.j2.moverManoMesa(tempJuego.cartaSeleccionada, fondoVacio.getParent().getParent().getComponentZOrder(fondoVacio.getParent()));
                        Main.repintar();
                        tempJuego.cartaSeleccionada = -1;
                        
                    } else {
                        int opcion=JOptionPane.showConfirmDialog(tempJuego, "No tienes suficiente maná.\n ¿Quieres cambiar esta carta por " + (Main.j1.getMano(tempJuego.cartaSeleccionada).getCoste() / 2) + " de maná?", "", YES_NO_OPTION);
                        if(opcion==YES_OPTION){
                            System.out.println("El jugador 2 gana mana, tiene "+Main.j2.getMana());
                            Main.j2.ganarMana(tempJuego.cartaSeleccionada);
                            System.out.println("El jugador 2 gana mana, tiene "+Main.j2.getMana());
                            Main.repintar();
                        }
                    }
                }
                if (Main.j1.hayCarta(0)== false && Main.j1.hayCarta(1)== false && Main.j1.hayCarta(2)== false &&tempJuego.turnoJ1) {
                    System.out.println(Main.j1.hayCarta(0));
                    System.out.println(Main.j1.hayCarta(1));
                    System.out.println(Main.j1.hayCarta(2));
                    System.out.println("Entro el if de que no kedan cartas");
                    tempJuego.turnoJ1 = false;
                    tempJuego.activarFocus();
                    Main.j2.cogerMano();
                    Main.repintar();
                }else if(Main.j1.hayCarta(0)== false && Main.j1.hayCarta(1)== false && Main.j1.hayCarta(2)== false && tempJuego.turnoJ1==false){
                    tempJuego.turnoJ1 = true;
                    tempJuego.activarFocus();
                    Main.j1.cogerMano();
                    Main.repintar();
                } 
                /*
                else {
                    tempJuego.turnoJ1 = true;
                    tempJuego.activarFocus();
                }
*/
            }

        });

        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                fondoVacio.setBorder(BorderFactory.createLineBorder(Color.white, 3));
            }

            @Override
            public void focusLost(FocusEvent e) {
                fondoVacio.setBorder(null);
            }
        });

        this.setOpaque(false);
    }
}
