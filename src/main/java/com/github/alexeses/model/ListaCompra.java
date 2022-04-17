package com.github.alexeses.model;

import java.util.ArrayList;

public class ListaCompra {

    private ArrayList<Producto> listaProductos;

    public ListaCompra(){
        listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListado() {
        return listaProductos;
    }

    public void addProducto(Producto p) {
        listaProductos.add(p);
    }

}
