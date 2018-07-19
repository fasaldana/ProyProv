/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Provincia {
    
    private int Id_Provincia;
    private String Nombre;

    public Provincia(int Id_Provincia, String Nombre) {
        this.Id_Provincia = Id_Provincia;
        this.Nombre = Nombre;
    }

    public Provincia() {
    }

    public int getId_Provincia() {
        return Id_Provincia;
    }

    public void setId_Provincia(int Id_Provincia) {
        this.Id_Provincia = Id_Provincia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
}
