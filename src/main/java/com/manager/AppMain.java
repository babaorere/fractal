/*
 * Aplicacion para ver y experimentar con varios tipos de graficos Fractales
 *
 */
package com.manager;

/**
 * Punto de entrada y ejecucion de la aplicacion
 *
 * @author manager
 */
public class AppMain {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                (new frmAppMenu()).setVisible(true);
            }
        });
    }
}
