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
public class ProveedorEmpresa {
    private String nombreEmpresa;
    private String tipoEmpresa;
    private String ruc;
    private String telefono;
    private Direccion direccionEmpresa;
    private ProveedorNatural representante;

    public ProveedorEmpresa() {
    }

    public ProveedorEmpresa(String nombreEmpresa, String tipoEmpresa, String ruc, String telefono, Direccion direccionEmpresa, ProveedorNatural representante) {
        this.nombreEmpresa = nombreEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.ruc = ruc;
        this.telefono = telefono;
        this.direccionEmpresa = direccionEmpresa;
        this.representante = representante;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(Direccion direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public ProveedorNatural getRepresentante() {
        return representante;
    }

    public void setRepresentante(ProveedorNatural representante) {
        this.representante = representante;
    }
    
    
}
