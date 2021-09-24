package com.manager;

import com.manager.menu_actions.ActionAcercaDe;
import com.manager.menu_actions.ActionSalir;
import com.manager.menu_actions.ActionTree_1;
import com.manager.menu_actions.ActionTree_2;
import com.manager.menu_actions.IAction;
import javax.swing.JFrame;

/**
 * Ventana principal de la Aplicacion, que contiene el Menu
 *
 * @author manager
 */
public final class frmAppMenu extends javax.swing.JFrame {

    // Atributos para enlazar las opciones del Menu con las acciones
    final IAction actionSalir;
    final IAction actionAcercaDe;
    final IAction actionTree_1;
    final IAction actionTree_2;

    /**
     * Creates new form frmAppMenu
     */
    public frmAppMenu() {
        initComponents();

        actionSalir = new ActionSalir();
        actionAcercaDe = new ActionAcercaDe();
        actionTree_1 = new ActionTree_1();
        actionTree_2 = new ActionTree_2();

        final JFrame me = this;
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                actionSalir.Exec(me);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGraph = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuTree = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));
        getContentPane().add(pnlGraph);

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenu1.add(jSeparator1);

        mnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        mnuSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Fractal");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        mnuTree.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        mnuTree.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mnuTree.setText("Tree");
        mnuTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTreeActionPerformed(evt);
            }
        });
        jMenu3.add(mnuTree);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItem1.setText("Tree 2");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenu2.setLabel("Ayuda");
        jMenu2.add(jSeparator2);

        mnuAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        mnuAcercaDe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mnuAcercaDe.setText("Acerca de Fractal");
        mnuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(810, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        actionSalir.Exec(this);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaDeActionPerformed
        actionAcercaDe.Exec(this);
    }//GEN-LAST:event_mnuAcercaDeActionPerformed

    private void mnuTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTreeActionPerformed
        actionTree_1.Exec(this);
    }//GEN-LAST:event_mnuTreeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        actionTree_2.Exec(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mnuAcercaDe;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuTree;
    private javax.swing.JPanel pnlGraph;
    // End of variables declaration//GEN-END:variables
}
