/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Vector;
import model.Clientes;

/**
 *
 * @author GONZALO
 */
public class ListaUsuario {
    
  public static Vector<Clientes> datos = new Vector<Clientes>();

    public static void agregar(Clientes obj){
    datos.addElement(obj);
}

    public static void eliminar(int pos){
    datos.removeElementAt(pos);
    }
    public static Vector mostrar(){
        return datos;
    
    }
    
}