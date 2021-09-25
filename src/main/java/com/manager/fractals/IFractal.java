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

    /**
     * Establece las condiciones iniciales del fractal
     *
     * @param panel
     */
    public void Setup(final JPanel panel);

    /**
     * Limpia la zona grafica
     */
    public void Clear();

    /**
     * Aqui se activa la recursividad, en las clases que lo implementen
     */
    public void Draw();

    public void paint(Graphics g);

    /**
     * Disminuye la velocidad de ejecucion
     */
    public void SetVelMenos();

    public void SetVelMas();

    /**
     * Disminuye el angulo inicial del fractal
     */
    public void SetAngMenos();

    /**
     * Aumenta el angulo inicial del Fractal
     */
    public void SetAngMas();

    /**
     * Disminuye la profundidad del Fractal
     */
    public void SetDeepMenos();

    /**
     * Aumenta la profundidad del Fractal
     */
    public void SetDeepMas();

    public void DefaultValues();

}
