package com.github.alexeses.model;

import java.util.ArrayList;

public class ListaCompra {

    private static ArrayList<Producto> listaProductos;

    public ListaCompra(){
        listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListado() {
        return listaProductos;
    }

    public void addProducto(Producto p) {
        listaProductos.add(p);
    }

    public void removeProducto(String nombre) {
        for (Producto p : listaProductos) {
            if (p.getNombre().equals(nombre)) {
                listaProductos.remove(p);
                break;
            }
        }
    }

}
