/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Producto;
import model.Vendedores;
import view.Admin;
import view.Login;
import view.Productos;
import view.Vendedor;

/**
 *
 * @author SENA
 */
public class ControllerVendedor implements ActionListener {

    public static Vendedor ven = new Vendedor();

    ArrayList<Vendedores> Listven = new ArrayList<Vendedores>();

    /*
    creamos las variables
     */
    private int id;
    public String Nombre, Apellidos;

    public ControllerVendedor(Vendedor ven) {
        this.ven = ven;
        this.iniciar();

        /*
        BOTONES VENDEDOR
         */
        this.ven.Registrar.addActionListener(this);
        this.ven.Mostrar.addActionListener(this);
        this.ven.Buscar.addActionListener(this);

    }

    public void iniciar() {
        this.ven.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*
        creamos las funciones de los botones y le ponemos los parametros para el JFrame Vendedor
         */
        if (this.ven.Registrar == e.getSource()) {

            id = Integer.parseInt(this.ven.Id.getText());
            Nombre = this.ven.Nombre.getText();
            Apellidos = this.ven.Apellidos.getText();

            Listven.add(new Vendedores(id, Nombre, Apellidos));

            tableven(this.ven.Tabla, Listven);

            JOptionPane.showMessageDialog(null, "DATO GUARDADO CON ÉXITO");

            this.ven.Id.setText("");
            this.ven.Nombre.setText("");
            this.ven.Apellidos.setText("");
        }

        if (this.ven.Mostrar == e.getSource()) {

            System.out.println("La lista contiene " + Listven.size() + " elementos\n");

            for (int i = 0; i < Listven.size(); i++) {
                System.out.println("Id: " + this.Listven.get(i).getId() + "\n" + "Nombre: " + this.Listven.get(i).getNombre() + "\n" + "Apellidos: " + this.Listven.get(i).getApellidos() + "\n");
            }

        }

        if (this.ven.Buscar == e.getSource()) {
            id = Integer.parseInt(this.ven.Id.getText());
            for (int i = 0; i < Listven.size(); i++) {
                if (id == Listven.get(i).getId()) {
                    this.ven.Nombre.setText(Listven.get(i).getNombre());
                    this.ven.Apellidos.setText(Listven.get(i).getApellidos());
                }
            }
        }
    }

    public void tableven(JTable Tabla, ArrayList<Vendedores> Listven) {

        for (int i = 0; i < this.Listven.size(); i++) {

            this.ven.Tabla.setValueAt(Listven.get(i).getId(), i, 0);
            this.ven.Tabla.setValueAt(Listven.get(i).getNombre(), i, 1);
            this.ven.Tabla.setValueAt(Listven.get(i).getApellidos(), i, 2);
        }

    }
}