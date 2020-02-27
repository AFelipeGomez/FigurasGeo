/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.lang.Math;

/**
 *
 * @author Andres Gomez - Ruby Cardenas
 */
public class FigurasGeometricas {

    protected int coordenadaX1;
    private int coordenadaX2;
    private int coordenadaX3;
    protected int coordenadaX4;
    protected int coordenadaY1;
    private int coordenadaY2;
    private int coordenadaY3;
    protected int coordenadaY4;
    protected int perimetro;
    protected int area;
    private int color;
    protected float distancia1;
    protected float distancia2;
    protected float distancia3;

    public FigurasGeometricas(int coordenada1, int coordenada2, int coordenada3, int color) {

        this.color = color;
        this.coordenadaX1 = coordenada1;
        this.coordenadaX2 = coordenada2;
        this.coordenadaX3 = coordenada3;
        this.color = color;

    }

    public void hallarPerimetro() {
        perimetro = (int) (distancia1 + distancia2 + distancia3);
    }

    public void hallarDistancias(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaX4, int coordenadaY1, int coordenadaY2, int coordenadaY3, int coordenadaY4) {
        int distancia1;
        int distancia2;
        int distancia3;

        distancia1 = (int) Math.sqrt(Math.pow((coordenadaX2 - coordenadaX1), 2) + Math.pow((coordenadaY2 - coordenadaY1), 2));
        distancia2 = (int) Math.sqrt(Math.pow((coordenadaX3 - coordenadaX2), 2) + Math.pow((coordenadaY3 - coordenadaY2), 2));
        distancia3 = (int) Math.sqrt(Math.pow((coordenadaX4 - coordenadaX3), 2) + Math.pow((coordenadaY4 - coordenadaY3), 2));

        this.distancia1 = distancia1;
        this.distancia2 = (int) distancia1;
        this.distancia3 = (int) distancia1;

    }

    public int getPerimetro() {
        return perimetro;
    }

    public int getArea() {
        return area;
    }

    public int getColor() {
        return color;
    }
}
