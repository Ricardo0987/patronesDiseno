package com.patrones_diseno.singleton;

public class Conexion {

    private String url;
    private String puerto;

    //estatica privada almacena referencia del objeto
    private static Conexion conexion;

    //constructor privado para no permitir su construccion en otras clases
    private Conexion(String url, String puerto) {
        this.url = url;
        this.puerto = puerto;
    }


    // metodo estatico publico
    public static Conexion crearConexion(String url, String puerto) {
        System.out.println("Conectando a: "
                .concat(url)
                .concat(":")
                .concat(puerto));
        return conexion;
    }

    //getter y setters

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public static Conexion getConexion() {
        return conexion;
    }

    public static void setConexion(Conexion conexion) {
        Conexion.conexion = conexion;
    }


}
