public class Proveedores {
    private String telefono; // P-Telefono
    private String nombre;   // P-Nombre
    private String email;    // P-Email
    private int  idProveedor //P-IdProveedor
    // Constructor
    public Proveedores(String telefono, String nombre, String email, int idProveedor ) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
        this.idProveedor = idProveedor;
    }

    // Getters y Setters
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public int getIdProveedor(){
        return idProveedor;
    }
     public void setIdProveedor(int idProveedor) {
        this.telefono = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Proveedores{" +
                "telefono='" + telefono + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", idProveedor='" + idProveedor + '\'' +
                '}';
    }
}
