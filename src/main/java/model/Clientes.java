/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static Model.ListaUsuario.mostrar;
import java.util.Vector;

/**
 *
 * @author SENA
 */
public class Clientes {

    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected String Direccion;

    public Clientes(int id, String Nombre, String Apellidos, String Direccion) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public static int verificarUsuarioNuevo(int Id, String Nombre, String Apellidos, String Direccion) {

        Vector lista = mostrar();
        Clientes obj;
        
        
        for (int i = 0; i < lista.size(); i++) {
            obj = (Clientes) lista.elementAt(i);
            if (obj.getId() == Id && obj.getNombre().equalsIgnoreCase(Nombre) && obj.getApellidos().equalsIgnoreCase(Apellidos)) {
                return i;
            }
        }
        return -1;
    }
}
