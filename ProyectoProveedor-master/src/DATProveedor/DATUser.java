/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATProveedor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author krac
 */
public class DATUser {

    Conexion mySql = new Conexion();
    /*
    *Recibe Usuario, Contrasena y un  boolean segun su valor se sabe si es persona o empresa.. 
    */
    public ResultSet validarCredencialesLogin(String user, String pass, boolean pase) throws ClassNotFoundException, SQLException {
        Statement coneccion = mySql.getConexion().createStatement();
        String sqlPersona = "SELECT usuarioPersona,contrasena \n"
                + "FROM `clientepersonaproveedor` \n"
                + "WHERE usuarioPersona = '" + user + "' \n"
                + "AND contrasena = '" + pass + "'";
        
        String sqlEmpresa = "SELECT usuarioEmpresa, contrasena FROM `clienteempresaproveedor` \n"
                + "WHERE usuarioEmpresa = '" + user + "' \n"
                + "AND contrasena = '" + pass + "'";

        if (pase == true) {
            return coneccion.executeQuery(sqlPersona);
        } else {
            return coneccion.executeQuery(sqlEmpresa);
        }

    }

}
