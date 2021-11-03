
package ventanas;

public class producto {
    private String nombre, precio, marca;
    public producto(String nombre, String precio, String marca){
        this.nombre=nombre;
        this.precio=precio;
        this.marca=marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }
    
}
