/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2015
 *
 * Name: Ryan Greene, Jack Napor, Danny Toback, & Richard Huffman
 * Date: Nov 13, 2015
 * Time: 3:16:39 PM
 *
 * Project: csci205FinalProject
 * Package: Game
 * File: ShopView
 * Description: The view class for the Shop, a popup window that allows
 * the player to make in game purcahses
 *
 * ****************************************
 */
package Game;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jrn011
 */
public class ShopView extends javax.swing.JFrame {

    /**
     * Creates new form ShopView
     */
    public ShopView() {
        setContentPane(new JLabel(new ImageIcon("images/shop.jpg")));
        initComponents();
    }

    public javax.swing.JLabel getJlabel6() {
        return jLabel6;
    }

    public javax.swing.JLabel getJlabel7() {
        return jLabel7;
    }

    public javax.swing.JLabel getJlabel8() {
        return jLabel8;
    }

    public javax.swing.JLabel getJlabel9() {
        return jLabel9;
    }

    public javax.swing.JLabel getJlabel15() {
        return jLabel15;
    }

    public javax.swing.JButton getJButton1() {
        return jButton1;
    }

    public javax.swing.JButton getJButton2() {
        return jButton2;
    }

    public javax.swing.JButton getJButton3() {
        return jButton3;
    }

    public javax.swing.JButton getJButton4() {
        return jButton4;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("<html>Refill Health<br />(50 Points)</html>");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 120, 40));

        jButton2.setText("<html>Buy Ammo</html>");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 130, 40));

        jButton3.setText("<html>Refill Armor (100 Points)</html>");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, 50));

        jButton4.setText("<html>Upgrade Weapon<br />  (100 Points)</html>");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 140, 40));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Current Health:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Current Ammo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Current Armor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Current Damage:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("0");
        jLabel6.setPreferredSize(new java.awt.Dimension(17, 17));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 65, -1));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("0");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("0");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("0");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 50, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Images/medkit.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 104, 78));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Images/ammo.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Images/armor.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Images/gun.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Points:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("0");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
