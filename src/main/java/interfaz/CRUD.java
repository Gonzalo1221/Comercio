/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

/**
 *
 * @author SENA
 */
public interface CRUD {
    public boolean guardar(int id, String nombre, String apellidos, String direccion );
    public boolean actualizar(int id, String nombre, String apellidos, String direccion );
    public boolean eliminar(int id);
}
