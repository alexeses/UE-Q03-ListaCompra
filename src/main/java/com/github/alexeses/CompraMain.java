package com.github.alexeses;

import com.github.alexeses.controlador.ListaCompraControlador;
import com.github.alexeses.gui.VentanaCompra;

import java.awt.*;

public class CompraMain {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaCompra ventana = new VentanaCompra();
                ListaCompraControlador controlador = new ListaCompraControlador(ventana);
                ventana.setControlador(controlador);
                ventana.setVisible(true);
            }
        });
    }
}