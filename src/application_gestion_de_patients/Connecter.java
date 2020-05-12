/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application_gestion_de_patients;

import java.sql.*;
import java.time.Clock;

/**
 *
 * @author user
 */
public class Connecter {
    Connection con;
    public Connecter(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
                System.err.println(e);
                //pour afficher l'erreur
                }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3308/hospital?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","root");
        }catch(SQLException e){System.err.println(e);}
        
    }
    Connection obtenirconnexion(){
        return con;
    }
}
