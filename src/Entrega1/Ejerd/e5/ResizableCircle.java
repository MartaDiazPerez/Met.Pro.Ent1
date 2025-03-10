package Entrega1.Ejerd.e5;

import Entrega1.Ejerd.e2.GeometricObject;
class ResizableCircle extends Circle implements Resizable {
    /**ZONA DE METODOS**/
    //Constructor de la clase ResizableCircle.
    public ResizableCircle(double radius) {
        super(radius);
    }

    //Cambia el tamaño del círculo en un porcentaje dado.
    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
