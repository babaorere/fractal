/*
 */
package com.manager.fractals;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author manager
 */
public final class CanvasFractalTree_2 extends Canvas implements IFractal {

    private JPanel panel;

    private int xi;
    private int yi;
    private int tamanoi;
    private int anguloi;
    private int profundidadi;

    private double sx = 1.0;
    private double sy = 1.0;

    /**
     * Constructor
     *
     */
    public CanvasFractalTree_2() {

    }

    /**
     * Establece el tiempò de pausa entre la reproduccion de cada parte del fractal
     *
     * @param _tpause
     */
    @Override
    public void setVel(final int _tpause) {
    }

    @Override
    public void setDeep(final int _nlevel) {
    }

    @Override
    public void setup(JPanel panel) {

        this.panel = panel;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DefaultValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint(Graphics g) {

        xi = panel.getWidth() / 2;
        yi = panel.getHeight();

        tamanoi = 50;
        anguloi = -90;

//        profundidadi = sliderprof.getValue();
        profundidadi = 12;

        g.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON); //Filtro antialiasing              

        g.setColor(Color.black);
        g.fillRect(0, 0, xi * 2, yi);

        Dibujar(g, xi, yi, anguloi, profundidadi, tamanoi);
    }

    private void Dibujar(Graphics g, int x1, int y1, double angulo, int profundidad, int tamano) {
        if (profundidad <= 0) {
            return;
        }

        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.GREEN);

        int x2 = x1 + (int) (Math.cos(Math.toRadians(angulo)) * tamano * sx);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angulo)) * tamano * sy);
        g2.drawLine(x1, y1, x2, y2);

        Dibujar(g2, x2, y2, angulo - 20, profundidad - 1, (int) (tamano * .9));
        Dibujar(g2, x2, y2, angulo + 20, profundidad - 1, (int) (tamano * .9));
    }

}
