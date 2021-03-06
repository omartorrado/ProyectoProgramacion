/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import maagic.Carta;

/**
 *
 * @author Delio
 */
public class CartaInterfaz extends javax.swing.JPanel {

    Carta cartaElegida;
    int anteriorCartaElegida;
    /**
     * Creates new form Carta
     * @param c
     */
    
    
    public CartaInterfaz(Carta c) {
        initComponents();
        jLabelAtaque.setText("" + c.getAtaque());
        jLabelVida.setText("" + c.getVida());
        jLabelCoste.setText("" + c.getCoste());
        ImagenesFondo.setSize(180, 250);
        //Muy lento este metodo
        miLibreria.DimensionPantalla.resizeImagen("/maagic/img/wood_repeatable.jpg", ImagenesFondo);
    }
    
    public static void actualizar(CartaInterfaz car,Carta c){
        car.jLabelAtaque.setText("" + c.getAtaque());
        car.jLabelVida.setText("" + c.getVida());
        car.jLabelCoste.setText("" + c.getCoste());
        //this.getParent().requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelVida = new javax.swing.JLabel();
        jLabelAtaque = new javax.swing.JLabel();
        jLabelCoste = new javax.swing.JLabel();
        Ataque = new javax.swing.JLabel();
        Vida = new javax.swing.JLabel();
        Coste = new javax.swing.JLabel();
        ImagenesFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(180, 250));
        setOpaque(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVida.setFont(new java.awt.Font("Monospaced", 3, 36)); // NOI18N
        jLabelVida.setForeground(new java.awt.Color(240, 240, 240));
        jLabelVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVida.setText("X");
        add(jLabelVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, 50));

        jLabelAtaque.setFont(new java.awt.Font("Monospaced", 3, 36)); // NOI18N
        jLabelAtaque.setForeground(new java.awt.Color(255, 51, 51));
        jLabelAtaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtaque.setText("X");
        add(jLabelAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 50, 50));

        jLabelCoste.setFont(new java.awt.Font("Monospaced", 3, 36)); // NOI18N
        jLabelCoste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCoste.setText("X");
        add(jLabelCoste, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        Ataque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/espada.png"))); // NOI18N
        add(Ataque, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 50, 50));

        Vida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/corazon.png"))); // NOI18N
        add(Vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, 50));

        Coste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Coste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/mana.png"))); // NOI18N
        add(Coste, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        ImagenesFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/wood_repeatable.jpg"))); // NOI18N
        ImagenesFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 102, 0)));
        add(ImagenesFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 250));

        getAccessibleContext().setAccessibleName("panelCarta");
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //System.out.println("Parent accesibleName: "+this.getParent().getAccessibleContext().getAccessibleName());
        this.requestFocusInWindow();
        /*
        System.out.println("Focus?"+this.isFocusOwner());
        if(this.getParent().getAccessibleContext().getAccessibleName().equals("panelBaraja")){
        ImagenesFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(0,255,0)));
        cartaElegida=new Carta(Integer.parseInt(this.jLabelVida.getText()),Integer.parseInt(this.jLabelAtaque.getText()),Integer.parseInt(this.jLabelCoste.getText()));
        anteriorCartaElegida=this.getParent().getComponentZOrder(this);
        }
        else if(this.getParent().getAccessibleContext().getAccessibleName().equals("panelCartas")){
            
        }
        System.out.println("Este es el componente nº: "+anteriorCartaElegida);
        System.out.println("Este es el componente elegido"+this.getParent().getComponent(anteriorCartaElegida));
        */
    }//GEN-LAST:event_formMouseClicked

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        ImagenesFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 102, 0)));
            //if(this.getParent().getParent().getParent().getComponent(5).isFocusOwner()){
        //ImagenesFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 0, 0)));
//        }
//        else{
//            ImagenesFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 102, 0)));
//        }
    }//GEN-LAST:event_formFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        ImagenesFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(0,255,0)));
        /*
        if(this.getParent().getAccessibleContext().getAccessibleName().equals("mano")){
        String[] manaOAtaque={"Ganar Mana","Atacar","Cancelar"};
        this.getParent().requestFocusInWindow();
        String opcion=JOptionPane.showInputDialog(this.getRootPane(),"Escoge una Opcion", "",JOptionPane.INFORMATION_MESSAGE, null,manaOAtaque, manaOAtaque[0]).toString();
        int posicion=this.getParent().getParent().getComponentZOrder(this.getParent());
        System.out.println("Opcion: "+opcion+" posicion: "+posicion);
        System.out.println("focus sigue en carta?"+this.isFocusOwner());
        }
        */
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ataque;
    private javax.swing.JLabel Coste;
    private javax.swing.JLabel ImagenesFondo;
    private javax.swing.JLabel Vida;
    private javax.swing.JLabel jLabelAtaque;
    private javax.swing.JLabel jLabelCoste;
    private javax.swing.JLabel jLabelVida;
    // End of variables declaration//GEN-END:variables
}
