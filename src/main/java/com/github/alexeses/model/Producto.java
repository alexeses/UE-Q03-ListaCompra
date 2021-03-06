package com.github.alexeses.model;

public class Producto {

    private String nombre;
    private int cantidad;
    private String unidades;

    public Producto(String nombre, int cantidad, String unidades) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidades = unidades;
    }

    @Override
    public String toString() {

        return  "  Nombre producto: " + nombre + "\n" +
                "  Cantidad: " + cantidad + "\n" +
                "  Unidades " + unidades;
    }

    public String getNombre() {
        return nombre;
    }
}
