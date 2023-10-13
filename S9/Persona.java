public class Personas {
    protected int dni;
    protected String nombres;
    protected String  apellidos;
    protected int edad;
    protected String  correo;
    protected int  telefono;

    public Personas(){
    }

    public Personas(int dni, String nombres, String apellidos, int edad, String correo, int telefono) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void mandarCorreo(){
        System.out.println("Enviando correo de: " + correo);
    }

    @Override
    public String toString() {
        return "Personas [dni=" + dni + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad
                + ", correo=" + correo + ", telefono=" + telefono + "]";
    }
    
    
}