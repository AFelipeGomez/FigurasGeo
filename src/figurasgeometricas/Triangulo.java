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
public class Triangulo extends FigurasGeometricas {

    public Triangulo(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaY1, int coordenadaY2, int coordenadaY3) {
        super(coordenadaX1, coordenadaX2, coordenadaX3, coordenadaY1, coordenadaY2, coordenadaY3);
    }

    public void hallarAreaEquilatero() {
        setArea((int) (Math.sqrt(3) * (Math.pow(2, getLado2()))));
    }

}
