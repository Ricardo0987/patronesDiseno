package com.patrones_diseno.inyeccion_dependencias;

public class CalcularSuma {
    ObtenerNumeros obtenerNumeros;
    Sumar sumar;
    MostrarResultado mostrarResultado;

    public CalcularSuma(ObtenerNumeros obtenerNumeros, Sumar sumar, MostrarResultado mostrarResultado) {
        this.obtenerNumeros = obtenerNumeros;
        this.sumar = sumar;
        this.mostrarResultado = mostrarResultado;
    }
    public void exec(){
        obtenerNumeros.obtenerNumeros();
        sumar.sumar();
        mostrarResultado.mostrarResultado();
    }
}
