/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/**
 *
 * @author belca
 */
public class administrador {
    private String user;
    private char[] pass;
    private String nombre;
    private String apellido;
    
   public administrador(String user, char[] pass, String nombre, String Apellido){
    this.user = user;
    this.pass = pass;
    this.nombre = nombre;
    this.apellido = Apellido;
}

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(char[] pass) {
        this.pass = pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public char[] getPass() {
        return pass;
    }

    public String getUser() {
        return user;
    }

  
   
   
   
}

