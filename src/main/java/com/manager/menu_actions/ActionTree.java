package com.manager.menu_actions;

import com.manager.dlgTree;
import javax.swing.JFrame;

/**
 * Para mostrar la ventana del Fractal. La clase es declarada final, ya que no tiene sentido heredar de ella
 *
 * @author manager
 */
public final class ActionTree implements IAction {

    @Override
    public void Exec(JFrame frame) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                dlgTree dialog = new dlgTree(frame);
                dialog.setVisible(true);
            }
        });

    }
}
