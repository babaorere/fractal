/*
 */
package com.manager.fractals;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 * Clase modelo, a partir de la cual se deben heredar todos los Fractal
 *
 * @author manager
 */
public abstract class CanvasFractalModel extends Canvas implements IFractal {

    /**
     * Tiempo maximo en pausa, para controlar la velocidad de ejecucion
     *
     */
    private final static int MAX_SLEEP = 250;

    /**
     * Utilizado para pasar de Grados a Radianes
     */
    private final static double PI_180 = Math.PI / 180.00;

    /**
     * Maxima profundidad del Arbol
     */
    private final static int MAX_DEEP = 10;

    /**
     * Mantiene el panel donde esta anclado este componente
     */
    private JPanel panel;

    /**
     * Representa el ambiente grafico del Panel
     */
    private static Graphics2D g;

    /**
     * Establece la velocidad de ejecucion
     */
    private static int tpause;

    /**
     * Establece la cantidad de niveles del fractal
     */
    private static int initLevel;

    /**
     * Utilizado para mantener constante el escalamiento del fractal
     */
    private static int offset;

    private static final java.util.Random RANDOM = new java.util.Random(); // Generador de numeros aleatorios

    // Vectores para generar los colores segun el nivel
    private static int[] RED = {50, 75, 100, 125, 150, 175, 180, 205, 230, 255};
    private static int[] GREEN = {255, 245, 235, 225, 215, 205, 195, 185, 175, 165};
    private static int[] BLUE = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public CanvasFractalModel() {
        tpause = 0;
        initLevel = 10;
        offset = 0;
        panel = null;
        g = null;
    }

    /**
     * Establece el tiempò de pausa entre la reproduccion de cada parte del fractal
     *
     * @param _tpause
     */
    @Override
    public void setVel(final int _tpause) {
        if (_tpause >= 0 && _tpause <= getMAX_SLEEP()) {
            setTpause(_tpause);
        }
    }

    @Override
    public void setDeep(final int _initlevel) {
        if (_initlevel >= 1 && _initlevel <= getMAX_DEEP()) {
            setInitLevel(_initlevel);
        }
    }

    @Override
    public void setup(final JPanel panel) {
        this.setPanel(panel);
    }

    @Override
    public void clear() {
        getG().setColor(Color.black);
        getG().fillRect(0, 0, getPanel().getWidth(), getPanel().getHeight());
    }

    /**
     * @return the MAX_SLEEP
     */
    public static int getMAX_SLEEP() {
        return MAX_SLEEP;
    }

    /**
     * @return the PI_180
     */
    public static double getPI_180() {
        return PI_180;
    }

    /**
     * @return the MAX_DEEP
     */
    public static int getMAX_DEEP() {
        return MAX_DEEP;
    }

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * @return the g
     */
    public static Graphics2D getG() {
        return g;
    }

    /**
     * @param aG the g to set
     */
    public static void setG(Graphics2D aG) {
        g = aG;
    }

    /**
     * @return the tpause
     */
    public static int getTpause() {
        return tpause;
    }

    /**
     * @param aTpause the tpause to set
     */
    public static void setTpause(int aTpause) {
        tpause = aTpause;
    }

    /**
     * @return the initLevel
     */
    public static int getInitLevel() {
        return initLevel;
    }

    /**
     * @param aInitLevel the initLevel to set
     */
    public static void setInitLevel(int aInitLevel) {
        initLevel = aInitLevel;
    }

    /**
     * @return the offset
     */
    public static int getOffset() {
        return offset;
    }

    /**
     * @param aOffset the offset to set
     */
    public static void setOffset(int aOffset) {
        offset = aOffset;
    }

    /**
     * @return the RANDOM
     */
    public static java.util.Random getRANDOM() {
        return RANDOM;
    }

    /**
     * @return the RED
     */
    public static int[] getRED() {
        return RED;
    }

    /**
     * @return the GREEN
     */
    public static int[] getGREEN() {
        return GREEN;
    }

    /**
     * @return the BLUE
     */
    public static int[] getBLUE() {
        return BLUE;
    }

}
