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
public class Canton {
    // Asi es
    private int IdProvincia;
    private int IdCanton;
    private String Canton;

    public Canton(int IdCanton, int IdProvincia, String Canton) {
        this.IdCanton = IdCanton;
        this.IdProvincia = IdProvincia;
        this.Canton = Canton;
    }

    public Canton() {
    }

    public int getIdCanton() {
        return IdCanton;
    }

    public void setIdCanton(int IdCanton) {
        this.IdCanton = IdCanton;
    }

    public int getIdProvincia() {
        return IdProvincia;
    }

    public void setIdProvincia(int IdProvincia) {
        this.IdProvincia = IdProvincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }
    
    
    
}
