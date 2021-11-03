
package ventanas;

public class cliente {
    private String nombre, apellido, direccion;
    public cliente(String nombre, String apellido, String direccion){
        this.nombre= nombre;
        this.apellido= apellido;
        this.direccion= direccion;
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
    
}
