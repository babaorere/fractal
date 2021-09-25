/*
 */
package com.manager.fractals;

import static com.manager.fractals.CanvasFractalModel.getMAX_DEEP;
import static com.manager.fractals.CanvasFractalModel.setG;
import static com.manager.fractals.CanvasFractalModel.setInitAngle;
import static com.manager.fractals.CanvasFractalModel.setOffset;
import static com.manager.fractals.CanvasFractalModel.setTpause;
import static com.manager.fractals.CanvasFractalTree_1.startX;
import static com.manager.fractals.CanvasFractalTree_1.startY;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import static com.manager.fractals.CanvasFractalModel.getInitDeep;
import static com.manager.fractals.CanvasFractalModel.setInitDeep;

/**
 *
 * @author manager
 */
public final class CanvasFractalTree_2 extends CanvasFractalModel {

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
        super();
    }

    @Override
    public void Draw() {

        Clear();

        if (isClear()) {
            setClear(false);
        } else {
            drawFractal(getG(), xi, yi, getInitAngle(), profundidadi, tamanoi);
        }

    }

    @Override
    public void DefaultValues() {
    }

    @Override
    public void paint(Graphics aG) {

        setG((Graphics2D) aG);

        setOffset(getMAX_DEEP() - getInitDeep());

        startX = getPanel().getWidth() / 2;
        startY = getPanel().getHeight();

        xi = getPanel().getWidth() / 2;
        yi = getPanel().getHeight();

        tamanoi = 50;
        anguloi = -90;
        profundidadi = 12;

        getG().setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON); //Filtro antialiasing              

        getG().setColor(Color.black);
        getG().fillRect(0, 0, xi * 2, yi);

        Clear();

        Draw();
    }

    private void drawFractal(Graphics2D g, int x1, int y1, double angulo, int profundidad, int tamano) {
        if (profundidad <= 0) {
            return;
        }

        g.setColor(Color.GREEN);

        int x2 = x1 + (int) (Math.cos(Math.toRadians(angulo)) * tamano * sx);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angulo)) * tamano * sy);
        g.drawLine(x1, y1, x2, y2);
        if (getTpause() > 0) {
            try {
                Thread.sleep(getTpause());
            } catch (InterruptedException ex) {
                // No hacer algo
            }
        }

        drawFractal(g, x2, y2, angulo - 20, profundidad - 1, (int) (tamano * .9));
        drawFractal(g, x2, y2, angulo + 20, profundidad - 1, (int) (tamano * .9));
    }

    @Override
    public void Setup(final JPanel panel) {
        super.Setup(panel);

        setTpause(0);
        setInitAngle(-90);
        setInitDeep(5);
    }

}
