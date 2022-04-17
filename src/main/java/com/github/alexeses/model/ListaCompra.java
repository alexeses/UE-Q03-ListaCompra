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

    // Comprobar si en listaProductos tiene al menos uno o mas productos
    public static boolean isEmpty() {
        return listaProductos.isEmpty();
    }


}
