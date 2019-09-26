package com.patrones_diseno.inyeccion_dependencias;

public class InyeccionDemo {

    public static void main(String[] args) {
        CalcularSuma ca;
        ca = new CalcularSuma(new ObtenerNumeros(),new Sumar(), new MostrarResultado());
        ca.exec();
    }
}
