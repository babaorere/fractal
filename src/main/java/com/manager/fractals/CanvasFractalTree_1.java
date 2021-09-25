/*
 */
package com.manager.fractals;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 *
 * @author manager
 */
public class CanvasFractalTree_1 extends Canvas implements IFractal {

    JPanel panel;

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

    private static final java.util.Random r = new java.util.Random(); // Generador de numeros aleatorios

    public static int startX; // Coordenada X inicial
    public static int startY; // Coordenada Y inicial
    public static double treeSize; //Size of the tree. (Default = 2) 
    public static final int randFact = 30; //Random factor on branch angles
    public static final int[] constFact = {-60, 05, -50, 45}; //Constant factor on branch angles    

    public static int offset;

    // Vectores para generar los colores segun el nivel
    public static int[] red = {50, 75, 100, 125, 150, 175, 180, 205, 230, 255};
    public static int[] green = {255, 245, 235, 225, 215, 205, 195, 185, 175, 165};

    public CanvasFractalTree_1() {
        startX = 0;
        startY = 0;
        tpause = 0;
        initLevel = 10;
        offset = 0;
        treeSize = 1.78;
        panel = null;
    }

    /**
     * Establece el tiempò de pausa entre la reproduccion de cada parte del fractal
     *
     * @param _tpause
     */
    @Override
    public void setVel(final int _tpause) {
        if (_tpause >= 0 && _tpause <= MAX_SLEEP) {
            tpause = _tpause;
        }
    }

    @Override
    public void setDeep(final int _initlevel) {
        if (_initlevel >= 1 && _initlevel <= MAX_DEEP) {
            initLevel = _initlevel;
        }
    }

    @Override
    public void setup(final JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void clear() {
        g.setColor(Color.black);
        g.fillRect(0, 0, panel.getWidth(), panel.getHeight());
    }

    @Override
    public void draw() {
        drawFractal(startX, startY, initLevel, 0);
    }

    @Override
    public void DefaultValues() {
    }

    @Override
    public void paint(Graphics g) {

        CanvasFractalTree_1.g = (Graphics2D) g;

        offset = MAX_DEEP - initLevel;

        startX = panel.getWidth() / 2;
        startY = panel.getHeight();

        clear();

        draw();
    }

    // Metodo recursivo, retorna cuando se halla cumplido el nivel de profundidad
    private static void drawFractal(int x, int y, int deep, int angle) {

        if (deep <= 0) {
            return;
        }

        final int len = (int) Math.round(Math.pow(treeSize, deep - 1 + offset)); // Calcular la longitud de la rama

        final int xn1 = (int) Math.round(x - (2 * len * Math.sin(angle * PI_180))); // longitud y angulo
        final int yn1 = (int) Math.round(y - (2 * len * Math.cos(angle * PI_180))); // de las ramas
        final int mid1x = (x + xn1) / 2; // Pocision de las ramas
        final int mid1y = (y + yn1) / 2;
        final int mid2x = (mid1x + xn1) / 2;
        final int mid2y = (mid1y + yn1) / 2;
        final int mid3x = (x + mid1x) / 2;
        final int mid3y = (y + mid1y) / 2;
        final int mid4x = (mid3x + mid1x) / 2;
        final int mid4y = (mid3y + mid1y) / 2;

        Color c = new Color(red[(deep + offset) % 10], green[(deep + offset) % 10], 0); // Crea un color a partir del nivel
        g.setColor(c); // Establece el color
        g.draw(new Line2D.Double(x, y, xn1, yn1)); // Dibuja una linea

        drawFractal(mid1x, mid1y, deep - 1, (angle + r.nextInt(randFact) + constFact[0]) % 360);
        if (tpause > 0) {
            try {
                Thread.sleep(tpause);
            } catch (InterruptedException ex) {
                // No hacer algo
            }
        }

        drawFractal(mid2x, mid2y, deep - 1, (angle + r.nextInt(randFact) + constFact[1]) % 360);
        if (tpause > 0) {
            try {
                Thread.sleep(tpause);
            } catch (InterruptedException ex) {
                // No hacer algo
            }
        }

        drawFractal(mid3x, mid3y, deep - 1, (angle + r.nextInt(randFact) + constFact[2]) % 360);
        if (tpause > 0) {
            try {
                Thread.sleep(tpause);
            } catch (InterruptedException ex) {
                // No hacer algo
            }
        }

        drawFractal(mid4x, mid4y, deep - 1, (angle + r.nextInt(randFact) + constFact[3]) % 360);
        if (tpause > 0) {
            try {
                Thread.sleep(tpause);
            } catch (InterruptedException ex) {
                // No hacer algo
            }
        }
    }

}
