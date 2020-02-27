/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author PIPE
 */
public class CuadradoRectangulo extends FigurasGeometricas {

    protected int distancia4;

    public CuadradoRectangulo(int coordenada1, int coordenada2, int coordenada3, int color) {
        super(coordenada1, coordenada2, coordenada3, color);
    }

    @Override
    public void hallarDistancias(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaX4, int coordenadaY1, int coordenadaY2, int coordenadaY3, int coordenadaY4) {
        super.hallarDistancias(coordenadaX1, coordenadaX2, coordenadaX3, coordenadaX4, coordenadaY1, coordenadaY2, coordenadaY3, coordenadaY4); //To change body of generated methods, choose Tools | Templates.
        distancia4 = (int) Math.sqrt(Math.pow((coordenadaX1 - coordenadaX4), 2) + Math.pow((coordenadaY1 - coordenadaY4), 2));

    }

    @Override
    public void hallarPerimetro() {
        super.hallarPerimetro(); //To change body of generated methods, choose Tools | Templates.
        perimetro = perimetro + distancia4;
    }

    public void hallarArea() {

        area = (int) (distancia1 * distancia1);
    }
}
