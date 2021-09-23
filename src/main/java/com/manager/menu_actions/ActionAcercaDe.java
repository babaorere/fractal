package com.manager.menu_actions;

import javax.swing.JFrame;

/**
 * Para mostrar la ventana Acerca De, que contiene informacion basica de la aplicacion
 *
 * @author manager
 */
public class ActionAcercaDe implements IAction {

    private final JFrame frame;

    public ActionAcercaDe(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void Exec() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                dlgAcercaDe dialog = new dlgAcercaDe(new javax.swing.JFrame());
                dialog.setVisible(true);
            }
        });

    }
}
