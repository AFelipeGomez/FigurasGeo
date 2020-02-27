/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Asus-PC
 */
public class FigurasGeometricas {

   private int coordenada1;
    private int coordenada2;
    private int coordenada3;
    private int perimetro;
    private int area;
    private int color;

    public FigurasGeometricas(int coordenada1, int coordenada2, int coordenada3, int color) {

        this.color = color;
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
        this.coordenada3 = coordenada3;
        this.color = color;

    }

    public int getCoordenada1() {
        return coordenada1;
    }

    public int getCoordenada2() {
        return coordenada2;
    }

    public int getCoordenada3() {
        return coordenada3;
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
