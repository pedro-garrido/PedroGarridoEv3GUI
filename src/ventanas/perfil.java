
package ventanas;


public class perfil {
    private String nombre, apellido, rol;
    public perfil(String nombre, String apellido, String rol){
        this.nombre=nombre;
        this.apellido=apellido;
        this.rol=rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }
    
}
