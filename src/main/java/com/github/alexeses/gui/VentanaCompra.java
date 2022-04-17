package com.github.alexeses.gui;

import com.github.alexeses.controlador.ListaCompraControlador;
import com.github.alexeses.model.Producto;

import javax.swing.*;
import java.util.ArrayList;

public class VentanaCompra extends JFrame {
    private JTextField txtNombre;
    private JSpinner spnCantidad;
    private JComboBox cbxUnidad;
    private JButton btnOK;
    private JTextArea txtLista;
    private JLabel jblNombre;
    private JLabel jblCantidad;
    private JLabel jblUnidad;
    private JScrollPane scrollPanel;
    private JPanel mainMenu;
    private JButton btnSee;
    private JButton btnRemove;

    public VentanaCompra() {
        setContentPane(mainMenu);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        spnCantidad.setModel(new SpinnerNumberModel(1, 1, 500, 1));
    }

    public void setControlador(ListaCompraControlador controlador) {
        btnOK.addActionListener(controlador);
        btnSee.addActionListener(controlador);
        btnRemove.addActionListener(controlador);
    }

    public Producto obtenerListaCompra() {
        Producto listacompra = null;

        String nombre = txtNombre.getText();
        if (txtNombre.getText().length() > 0) {
            nombre = txtNombre.getText();
        } else {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int cantidad = (int) spnCantidad.getValue();
        if (cantidad > 0) {
            cantidad = (int) spnCantidad.getValue();
        } else {
            JOptionPane.showMessageDialog(this, "La cantidad no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
        }

        String unidades = (String) cbxUnidad.getSelectedItem();

        if (cbxUnidad.getSelectedIndex() < cbxUnidad.getItemCount()) {
            unidades = cbxUnidad.getSelectedItem().toString();
        } else {
            unidades = "";
        }

        listacompra = new Producto(nombre, cantidad, unidades);

        return listacompra;

    }

    public void mostrarLista(ArrayList<Producto> listado) {
        String productos = "";

        for (Producto producto : listado) {
            productos += producto + "\n";
        }

        txtLista.setText("=== Lista de compra ===\n\n");
        txtLista.append(productos);

    }

    public void limpiarTxt(){
        txtNombre.setText("");
        spnCantidad.setValue(1);
        cbxUnidad.setSelectedIndex(0);
    }

    public String getProductName() {
        return txtNombre.getText();
    }

}
