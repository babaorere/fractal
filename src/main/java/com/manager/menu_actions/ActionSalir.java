package com.manager.menu_actions;

import javax.swing.JFrame;

/**
 * Utilizada para tomar acciones, liberar recursos y otros, y luego cerrar/salir de la aplicacion
 *
 * @author manager
 */
public class ActionSalir implements IAction {

    private final JFrame frame;

    public ActionSalir(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void Exec() {
        frame.setVisible(false);
        frame.dispose();
    }

}
