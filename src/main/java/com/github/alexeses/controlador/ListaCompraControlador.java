package com.github.alexeses.controlador;

import com.github.alexeses.gui.VentanaCompra;
import com.github.alexeses.model.ListaCompra;
import com.github.alexeses.model.Producto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListaCompraControlador implements ActionListener, ItemListener {

    VentanaCompra ventana;
    ListaCompra listaCompra;

    public ListaCompraControlador(VentanaCompra ventana) {
        this.ventana = ventana;
        listaCompra = new ListaCompra();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();
        e.getActionCommand();

        if (e.getSource() instanceof JButton) {
            if (e.getActionCommand().equals("Añadir")) {
                Producto producto = ventana.obtenerListaCompra();
                listaCompra.addProducto(producto);
                ventana.mostrarLista(listaCompra.getListado());
            }
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

}
