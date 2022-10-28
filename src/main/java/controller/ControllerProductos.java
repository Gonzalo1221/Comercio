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
public class ControllerProductos implements ActionListener {

    public Productos pro = new Productos();

    ArrayList<Producto> ListPro = new ArrayList<Producto>();
    /*
    creamos las variables
     */
    private int id;
    public String Nombre, precio, categoria;

    public ControllerProductos(Productos pro) {
        this.pro = pro;
        this.iniciar();

        /*
        BOTONES PRODUCTOS
         */
        this.pro.Registrar.addActionListener(this);
        this.pro.Mostrar.addActionListener(this);
        this.pro.Buscar.addActionListener(this);

    }

    public void iniciar() {
        this.pro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       

        /*
            creamos las funciones de los botones y le ponemos los parametros para el JFrame Productos
         */
        if (this.pro.Registrar == e.getSource()) {

            id = Integer.parseInt(this.pro.id.getText());
            Nombre = this.pro.Nombre.getText();
            precio = this.pro.Precio.getText();
            categoria = (String) this.pro.categoria.getSelectedItem();

            ListPro.add(new Producto(id, Nombre, precio, categoria));

            JOptionPane.showMessageDialog(null, "DATO GUARDADO CON ÉXITO");

            tablepro(this.pro.Tabla, ListPro);

            this.pro.id.setText("");
            this.pro.Nombre.setText("");
            this.pro.Precio.setText("");
            this.pro.categoria.setSelectedItem("");
        }

        if (this.pro.Mostrar == e.getSource()) {

            System.out.println("La lista contiene " + ListPro.size() + " elementos\n");

            for (int i = 0; i < ListPro.size(); i++) {
                System.out.println("Documento: " + this.ListPro.get(i).getId() + "\n" + "Nombre: " + this.ListPro.get(i).getNombre()
                        + "\n" + "Precio: " + this.ListPro.get(i).getPrecio() + "\n" + "Categoria " + this.ListPro.get(i).getCategoria());
            }
        }

        if (this.pro.Buscar == e.getSource()) {
            id = Integer.parseInt(this.pro.id.getText());
            for (int i = 0; i < ListPro.size(); i++) {
                if (id == ListPro.get(i).getId()) {
                    this.pro.Nombre.setText(ListPro.get(i).getNombre());
                    this.pro.Precio.setText(ListPro.get(i).getPrecio());
                }
            }

        }
    }

    public void tablepro(JTable Tabla, ArrayList<Producto> ListPro) {

        for (int i = 0; i < ListPro.size(); i++) {

            this.pro.Tabla.setValueAt(ListPro.get(i).getId(), i, 0);
            this.pro.Tabla.setValueAt(ListPro.get(i).getNombre(), i, 1);
            this.pro.Tabla.setValueAt(ListPro.get(i).getPrecio(), i, 2);
            this.pro.Tabla.setValueAt(ListPro.get(i).getCategoria(), i, 3);
        }
    }
}
