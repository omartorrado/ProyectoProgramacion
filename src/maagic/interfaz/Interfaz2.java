/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maagic.interfaz;

/**
 *
 * @author alvar
 */
public class Interfaz2 extends javax.swing.JPanel {

    /**
     * Creates new form Interfaz
     */
    public Interfaz2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugador1CorazonCuadro = new javax.swing.JPanel();
        jugador1Corazon = new javax.swing.JLabel();
        jugador1GotaCuadro = new javax.swing.JPanel();
        jugador1Gota = new javax.swing.JLabel();
        jugador1Mano = new javax.swing.JPanel();
        jugador1Mano1 = new javax.swing.JPanel();
        jugador1Mano2 = new javax.swing.JPanel();
        jugador1Mano3 = new javax.swing.JPanel();
        jugador2Mano = new javax.swing.JPanel();
        jugador2Mano1 = new javax.swing.JPanel();
        jugador2Mano2 = new javax.swing.JPanel();
        jugador2Mano3 = new javax.swing.JPanel();
        jugador1ManaCuadro = new javax.swing.JPanel();
        jugador1Mana = new javax.swing.JLabel();
        jugador1VidaCuadro = new javax.swing.JPanel();
        jugador1Vida = new javax.swing.JLabel();
        jugador2VidaCuadro = new javax.swing.JPanel();
        jugador2Vida = new javax.swing.JLabel();
        jugador2ManaCuadro = new javax.swing.JPanel();
        jugador2Mana = new javax.swing.JLabel();
        jugador2CorazonCuadro = new javax.swing.JPanel();
        jugador2Corazon = new javax.swing.JLabel();
        jugador2GotaCuadro = new javax.swing.JPanel();
        jugador2Gota = new javax.swing.JLabel();
        jugador1TableroCuadro = new javax.swing.JPanel();
        jugador1TableroCarta1 = new javax.swing.JPanel();
        jugador1TableroCarta2 = new javax.swing.JPanel();
        jugador1TableroCarta3 = new javax.swing.JPanel();
        jugador2TableroCuadro = new javax.swing.JPanel();
        jugador2TableroCarta1 = new javax.swing.JPanel();
        jugador2TableroCarta2 = new javax.swing.JPanel();
        jugador2TableroCarta3 = new javax.swing.JPanel();
        jugador1Baraja = new javax.swing.JLabel();
        jugador2Baraja = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        jugador1CorazonCuadro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jugador1CorazonCuadro.setPreferredSize(new java.awt.Dimension(50, 50));

        jugador1Corazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/corazon.png"))); // NOI18N

        javax.swing.GroupLayout jugador1CorazonCuadroLayout = new javax.swing.GroupLayout(jugador1CorazonCuadro);
        jugador1CorazonCuadro.setLayout(jugador1CorazonCuadroLayout);
        jugador1CorazonCuadroLayout.setHorizontalGroup(
            jugador1CorazonCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jugador1CorazonCuadroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jugador1Corazon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jugador1CorazonCuadroLayout.setVerticalGroup(
            jugador1CorazonCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador1Corazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jugador1CorazonCuadro);
        jugador1CorazonCuadro.setBounds(350, 20, 51, 50);

        jugador1Gota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/mana.png"))); // NOI18N

        javax.swing.GroupLayout jugador1GotaCuadroLayout = new javax.swing.GroupLayout(jugador1GotaCuadro);
        jugador1GotaCuadro.setLayout(jugador1GotaCuadroLayout);
        jugador1GotaCuadroLayout.setHorizontalGroup(
            jugador1GotaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador1Gota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jugador1GotaCuadroLayout.setVerticalGroup(
            jugador1GotaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador1Gota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jugador1GotaCuadro);
        jugador1GotaCuadro.setBounds(350, 80, 51, 50);

        jugador1Mano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jugador1ManoKeyPressed(evt);
            }
        });
        jugador1Mano.setLayout(new java.awt.GridLayout(3, 0));

        jugador1Mano1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador1Mano1Layout = new javax.swing.GroupLayout(jugador1Mano1);
        jugador1Mano1.setLayout(jugador1Mano1Layout);
        jugador1Mano1Layout.setHorizontalGroup(
            jugador1Mano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jugador1Mano1Layout.setVerticalGroup(
            jugador1Mano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador1Mano.add(jugador1Mano1);

        jugador1Mano2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador1Mano2Layout = new javax.swing.GroupLayout(jugador1Mano2);
        jugador1Mano2.setLayout(jugador1Mano2Layout);
        jugador1Mano2Layout.setHorizontalGroup(
            jugador1Mano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jugador1Mano2Layout.setVerticalGroup(
            jugador1Mano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador1Mano.add(jugador1Mano2);

        jugador1Mano3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador1Mano3Layout = new javax.swing.GroupLayout(jugador1Mano3);
        jugador1Mano3.setLayout(jugador1Mano3Layout);
        jugador1Mano3Layout.setHorizontalGroup(
            jugador1Mano3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jugador1Mano3Layout.setVerticalGroup(
            jugador1Mano3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador1Mano.add(jugador1Mano3);

        add(jugador1Mano);
        jugador1Mano.setBounds(10, 70, 200, 800);

        jugador2Mano.setPreferredSize(new java.awt.Dimension(180, 250));
        jugador2Mano.setLayout(new java.awt.GridLayout(3, 0));

        jugador2Mano1.setBackground(new java.awt.Color(153, 153, 153));
        jugador2Mano1.setPreferredSize(new java.awt.Dimension(180, 250));

        javax.swing.GroupLayout jugador2Mano1Layout = new javax.swing.GroupLayout(jugador2Mano1);
        jugador2Mano1.setLayout(jugador2Mano1Layout);
        jugador2Mano1Layout.setHorizontalGroup(
            jugador2Mano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jugador2Mano1Layout.setVerticalGroup(
            jugador2Mano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador2Mano.add(jugador2Mano1);

        jugador2Mano2.setBackground(new java.awt.Color(153, 153, 153));
        jugador2Mano2.setPreferredSize(new java.awt.Dimension(180, 250));

        javax.swing.GroupLayout jugador2Mano2Layout = new javax.swing.GroupLayout(jugador2Mano2);
        jugador2Mano2.setLayout(jugador2Mano2Layout);
        jugador2Mano2Layout.setHorizontalGroup(
            jugador2Mano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jugador2Mano2Layout.setVerticalGroup(
            jugador2Mano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador2Mano.add(jugador2Mano2);

        jugador2Mano3.setBackground(new java.awt.Color(153, 153, 153));
        jugador2Mano3.setPreferredSize(new java.awt.Dimension(180, 250));

        javax.swing.GroupLayout jugador2Mano3Layout = new javax.swing.GroupLayout(jugador2Mano3);
        jugador2Mano3.setLayout(jugador2Mano3Layout);
        jugador2Mano3Layout.setHorizontalGroup(
            jugador2Mano3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jugador2Mano3Layout.setVerticalGroup(
            jugador2Mano3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador2Mano.add(jugador2Mano3);

        add(jugador2Mano);
        jugador2Mano.setBounds(1380, 70, 200, 800);

        javax.swing.GroupLayout jugador1ManaCuadroLayout = new javax.swing.GroupLayout(jugador1ManaCuadro);
        jugador1ManaCuadro.setLayout(jugador1ManaCuadroLayout);
        jugador1ManaCuadroLayout.setHorizontalGroup(
            jugador1ManaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador1Mana, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jugador1ManaCuadroLayout.setVerticalGroup(
            jugador1ManaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador1Mana, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(jugador1ManaCuadro);
        jugador1ManaCuadro.setBounds(400, 80, 100, 50);

        javax.swing.GroupLayout jugador1VidaCuadroLayout = new javax.swing.GroupLayout(jugador1VidaCuadro);
        jugador1VidaCuadro.setLayout(jugador1VidaCuadroLayout);
        jugador1VidaCuadroLayout.setHorizontalGroup(
            jugador1VidaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador1Vida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jugador1VidaCuadroLayout.setVerticalGroup(
            jugador1VidaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador1Vida, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(jugador1VidaCuadro);
        jugador1VidaCuadro.setBounds(400, 20, 100, 50);

        javax.swing.GroupLayout jugador2VidaCuadroLayout = new javax.swing.GroupLayout(jugador2VidaCuadro);
        jugador2VidaCuadro.setLayout(jugador2VidaCuadroLayout);
        jugador2VidaCuadroLayout.setHorizontalGroup(
            jugador2VidaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jugador2VidaCuadroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jugador2Vida, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jugador2VidaCuadroLayout.setVerticalGroup(
            jugador2VidaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador2Vida, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(jugador2VidaCuadro);
        jugador2VidaCuadro.setBounds(1050, 10, 120, 50);

        javax.swing.GroupLayout jugador2ManaCuadroLayout = new javax.swing.GroupLayout(jugador2ManaCuadro);
        jugador2ManaCuadro.setLayout(jugador2ManaCuadroLayout);
        jugador2ManaCuadroLayout.setHorizontalGroup(
            jugador2ManaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jugador2ManaCuadroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jugador2Mana, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jugador2ManaCuadroLayout.setVerticalGroup(
            jugador2ManaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador2Mana, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(jugador2ManaCuadro);
        jugador2ManaCuadro.setBounds(1060, 70, 110, 50);

        jugador2Corazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/corazon.png"))); // NOI18N

        javax.swing.GroupLayout jugador2CorazonCuadroLayout = new javax.swing.GroupLayout(jugador2CorazonCuadro);
        jugador2CorazonCuadro.setLayout(jugador2CorazonCuadroLayout);
        jugador2CorazonCuadroLayout.setHorizontalGroup(
            jugador2CorazonCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador2Corazon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );
        jugador2CorazonCuadroLayout.setVerticalGroup(
            jugador2CorazonCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador2Corazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jugador2CorazonCuadro);
        jugador2CorazonCuadro.setBounds(1180, 10, 51, 50);

        jugador2Gota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/mana.png"))); // NOI18N

        javax.swing.GroupLayout jugador2GotaCuadroLayout = new javax.swing.GroupLayout(jugador2GotaCuadro);
        jugador2GotaCuadro.setLayout(jugador2GotaCuadroLayout);
        jugador2GotaCuadroLayout.setHorizontalGroup(
            jugador2GotaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador2Gota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );
        jugador2GotaCuadroLayout.setVerticalGroup(
            jugador2GotaCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador2Gota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jugador2GotaCuadro);
        jugador2GotaCuadro.setBounds(1180, 70, 51, 50);

        jugador1TableroCuadro.setLayout(new java.awt.GridLayout(3, 0));

        jugador1TableroCarta1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador1TableroCarta1Layout = new javax.swing.GroupLayout(jugador1TableroCarta1);
        jugador1TableroCarta1.setLayout(jugador1TableroCarta1Layout);
        jugador1TableroCarta1Layout.setHorizontalGroup(
            jugador1TableroCarta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jugador1TableroCarta1Layout.setVerticalGroup(
            jugador1TableroCarta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador1TableroCuadro.add(jugador1TableroCarta1);

        jugador1TableroCarta2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador1TableroCarta2Layout = new javax.swing.GroupLayout(jugador1TableroCarta2);
        jugador1TableroCarta2.setLayout(jugador1TableroCarta2Layout);
        jugador1TableroCarta2Layout.setHorizontalGroup(
            jugador1TableroCarta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jugador1TableroCarta2Layout.setVerticalGroup(
            jugador1TableroCarta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador1TableroCuadro.add(jugador1TableroCarta2);

        jugador1TableroCarta3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador1TableroCarta3Layout = new javax.swing.GroupLayout(jugador1TableroCarta3);
        jugador1TableroCarta3.setLayout(jugador1TableroCarta3Layout);
        jugador1TableroCarta3Layout.setHorizontalGroup(
            jugador1TableroCarta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jugador1TableroCarta3Layout.setVerticalGroup(
            jugador1TableroCarta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador1TableroCuadro.add(jugador1TableroCarta3);

        add(jugador1TableroCuadro);
        jugador1TableroCuadro.setBounds(580, 70, 200, 800);

        jugador2TableroCuadro.setLayout(new java.awt.GridLayout(3, 0));

        jugador2TableroCarta1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador2TableroCarta1Layout = new javax.swing.GroupLayout(jugador2TableroCarta1);
        jugador2TableroCarta1.setLayout(jugador2TableroCarta1Layout);
        jugador2TableroCarta1Layout.setHorizontalGroup(
            jugador2TableroCarta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jugador2TableroCarta1Layout.setVerticalGroup(
            jugador2TableroCarta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador2TableroCuadro.add(jugador2TableroCarta1);

        jugador2TableroCarta2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador2TableroCarta2Layout = new javax.swing.GroupLayout(jugador2TableroCarta2);
        jugador2TableroCarta2.setLayout(jugador2TableroCarta2Layout);
        jugador2TableroCarta2Layout.setHorizontalGroup(
            jugador2TableroCarta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jugador2TableroCarta2Layout.setVerticalGroup(
            jugador2TableroCarta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador2TableroCuadro.add(jugador2TableroCarta2);

        jugador2TableroCarta3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jugador2TableroCarta3Layout = new javax.swing.GroupLayout(jugador2TableroCarta3);
        jugador2TableroCarta3.setLayout(jugador2TableroCarta3Layout);
        jugador2TableroCarta3Layout.setHorizontalGroup(
            jugador2TableroCarta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jugador2TableroCarta3Layout.setVerticalGroup(
            jugador2TableroCarta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jugador2TableroCuadro.add(jugador2TableroCarta3);

        add(jugador2TableroCuadro);
        jugador2TableroCuadro.setBounds(820, 70, 200, 800);

        jugador1Baraja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/rsz_barajamagic.jpg"))); // NOI18N
        add(jugador1Baraja);
        jugador1Baraja.setBounds(260, 20, 76, 108);

        jugador2Baraja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maagic/img/rsz_barajamagic.jpg"))); // NOI18N
        add(jugador2Baraja);
        jugador2Baraja.setBounds(1240, 10, 76, 108);
    }// </editor-fold>//GEN-END:initComponents

    private void jugador1ManoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jugador1ManoKeyPressed
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_S){
            jugador1Mano2.grabFocus();
        }
    }//GEN-LAST:event_jugador1ManoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jugador1Baraja;
    private javax.swing.JLabel jugador1Corazon;
    private javax.swing.JPanel jugador1CorazonCuadro;
    private javax.swing.JLabel jugador1Gota;
    private javax.swing.JPanel jugador1GotaCuadro;
    private javax.swing.JLabel jugador1Mana;
    private javax.swing.JPanel jugador1ManaCuadro;
    private javax.swing.JPanel jugador1Mano;
    private javax.swing.JPanel jugador1Mano1;
    private javax.swing.JPanel jugador1Mano2;
    private javax.swing.JPanel jugador1Mano3;
    private javax.swing.JPanel jugador1TableroCarta1;
    private javax.swing.JPanel jugador1TableroCarta2;
    private javax.swing.JPanel jugador1TableroCarta3;
    private javax.swing.JPanel jugador1TableroCuadro;
    private javax.swing.JLabel jugador1Vida;
    private javax.swing.JPanel jugador1VidaCuadro;
    private javax.swing.JLabel jugador2Baraja;
    private javax.swing.JLabel jugador2Corazon;
    private javax.swing.JPanel jugador2CorazonCuadro;
    private javax.swing.JLabel jugador2Gota;
    private javax.swing.JPanel jugador2GotaCuadro;
    private javax.swing.JLabel jugador2Mana;
    private javax.swing.JPanel jugador2ManaCuadro;
    private javax.swing.JPanel jugador2Mano;
    private javax.swing.JPanel jugador2Mano1;
    private javax.swing.JPanel jugador2Mano2;
    private javax.swing.JPanel jugador2Mano3;
    private javax.swing.JPanel jugador2TableroCarta1;
    private javax.swing.JPanel jugador2TableroCarta2;
    private javax.swing.JPanel jugador2TableroCarta3;
    private javax.swing.JPanel jugador2TableroCuadro;
    private javax.swing.JLabel jugador2Vida;
    private javax.swing.JPanel jugador2VidaCuadro;
    // End of variables declaration//GEN-END:variables
}
