/*
 * Se trata de mantener un unico contrato para la manipulacion de los Fractales,
 * precisamente con una forma procedimental comun, lo que beneficia en mantener invariable el programa principal
 * a pesar de hacer cambios al Fractal en cuestion, añadir o eliminar modelos de fractales
 *
 */
package com.manager.fractals;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author manager
 */
public interface IFractal {

    public void setVel(final int vel);

    public void setDeep(final int _level);

    public void setup(final JPanel panel);

    public void clear();

    public void draw();

    public void DefaultValues();

    public void paint(Graphics g);

}
