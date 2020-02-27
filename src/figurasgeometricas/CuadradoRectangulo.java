/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Andres Gomez - Ruby Cardenas
 */
public class CuadradoRectangulo extends FigurasGeometricas {

    private int lado4;

    public CuadradoRectangulo(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaY1, int coordenadaY2, int coordenadaY3, int color, int lado4) {
        super(coordenadaX1, coordenadaX2, coordenadaX3, coordenadaY1, coordenadaY2, coordenadaY3, color);
        this.lado4 = lado4;
    }

    @Override
    public void hallarArea() {
        setArea(getLado1()*getLado2());
    }

    @Override
    public void hallarPerimetro() {
        setPerimetro(getPerimetro()+lado4);
    }
    

   
}
