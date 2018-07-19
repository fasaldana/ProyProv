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
public class Direccion {
    
    private Provincia provincia;
    private Canton canton;
    private String calle;

    public Direccion() {
    }

    public Direccion(Provincia provincia, Canton canton, String calle) {
        this.provincia = provincia;
        this.canton = canton;
        this.calle = calle;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

   
    
}
