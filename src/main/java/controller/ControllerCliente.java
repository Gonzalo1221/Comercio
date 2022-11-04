/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import Model.ListaUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Clientes;
import model.Producto;
import model.Vendedores;
import view.Admin;
import view.Cliente;
import view.Login;
import view.Productos;
import view.Vendedor;

/**
 *
 * @author SENA
 */
public class ControllerCliente implements ActionListener {

    /**
     *
     */
    public static Cliente cli = new Cliente();

    crudpersona crudp = new crudpersona();

    ArrayList<Clientes> ListCliente = new ArrayList<Clientes>();

    /*
    creamos las variables
     */
    private int id;
    public String Nombre, Apellidos, Direccion;

    public ControllerCliente(Cliente cli) {
        this.cli = cli;
        this.iniciar();


        /*
        BOTONES LOGIN Y CLIENTE
         */
        this.cli.Registrar.addActionListener(this);
        this.cli.Buscar.addActionListener(this);
        this.cli.Mostrar.addActionListener(this);
        this.cli.Eliminar.addActionListener(this);

    }

    public void iniciar() {
        this.cli.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*
        creamos las funciones de los botones y le ponemos los parametros para el JFrame Cliente
         */
        if (this.cli.Registrar == e.getSource()) {

            id = Integer.parseInt(this.cli.Id.getText());
            Nombre = this.cli.Nombre.getText();
            Apellidos = this.cli.Apellidos.getText();
            Direccion = this.cli.Direccion.getText();

            Clientes obj = new Clientes(id, Nombre, Apellidos, Direccion);

            if (Clientes.verificarUsuarioNuevo(id, Nombre, Apellidos, Direccion) == -1) {
                obj.setId(id);
                obj.setNombre(Nombre);
                obj.setApellidos(Apellidos);
                obj.setDireccion(Direccion);

                ListaUsuario.agregar(obj);

                table1(this.cli.Tabla, ListaUsuario.datos);

                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");

                this.cli.Id.setText("");
                this.cli.Nombre.setText("");
                this.cli.Apellidos.setText("");
                this.cli.Direccion.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "USERNAME YA EXISTE");
            }

//            ListCliente.add(new Clientes(id, Nombre, Apellidos, Direccion));
//            JOptionPane.showMessageDialog(null, "DATO GUARDADO CON ÉXITO");
        }

        if (this.cli.Mostrar == e.getSource()) {

           /* boolean respuesta = crudp.Ingresar();
            if (respuesta == true) {
                JOptionPane.showMessageDialog(null, "Verdadero");
            } else {
                JOptionPane.showMessageDialog(null, "Falso");

            }
            
*/
          /* int identi = Integer.parseInt(this.cli.Id.getText());
           crudp.buscar_Cliente(identi);*/
         boolean response =  crudp.eliminar(3);
         if(response){
             JOptionPane.showMessageDialog(null, "Datos Eliminado");
         }else{
             
             JOptionPane.showMessageDialog(null, "Error al Eliminar");
         }
            /*System.out.println("La lista contiene " + ListaUsuario.datos.size() + " elementos\n");

            for (int i = 0; i < ListaUsuario.datos.size(); i++) {
                System.out.println("Id: " + ListaUsuario.datos.get(i).getId() + "\n" + "Nombre: " + ListaUsuario.datos.get(i).getNombre() + "\n" + "Apellidos: " + ListaUsuario.datos.get(i).getApellidos() + "\n");
            }*/
        }

        if (this.cli.Buscar == e.getSource()) {

            id = Integer.parseInt(this.cli.Id.getText());

            for (int i = 0; i < ListaUsuario.datos.size(); i++) {
                if (id == ListaUsuario.datos.get(i).getId()) {
                    this.cli.Nombre.setText(ListaUsuario.datos.get(i).getNombre());
                    this.cli.Apellidos.setText(ListaUsuario.datos.get(i).getApellidos());
                    this.cli.Direccion.setText(ListaUsuario.datos.get(i).getDireccion());
                }
            }

        }

        if (this.cli.Eliminar == e.getSource()) {
            id = Integer.parseInt(this.cli.Id.getText());
            for (int i = 0; i < ListaUsuario.datos.size(); i++) {
                if (id == ListaUsuario.datos.get(i).getId()) {
                    ListaUsuario.datos.remove(i);

                    JOptionPane.showMessageDialog(null, "DATO ELIMINADO CON ÉXITO");

                    this.cli.Id.setText("");
                    this.cli.Nombre.setText("");
                    this.cli.Apellidos.setText("");
                    this.cli.Direccion.setText("");
                }
            }

        }

        if (this.cli.Eliminar == e.getSource()) {

            this.cli.Tabla.removeAll();

        }
    }

    public void table1(JTable Tabla, Vector<Clientes> ListCliente) {

        for (int i = 0; i < ListCliente.size(); i++) {

            this.cli.Tabla.setValueAt(ListCliente.get(i).getId(), i, 0);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getNombre(), i, 1);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getApellidos(), i, 2);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getDireccion(), i, 3);
        }

    }
}
