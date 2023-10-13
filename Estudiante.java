public class Estudiante extends Personas {
    private double notas;
    private int carnet;

    public Estudiante(){

    }

    public Estudiante(double notas, int carnet) {
        this.notas = notas;
        this.carnet = carnet;
    }

    public Estudiante(int dni, String nombres, String apellidos, int edad, String correo, int telefono, double notas,
            int carnet) {
        super(dni, nombres, apellidos, edad, correo, telefono);
        this.notas = notas;
        this.carnet = carnet;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    public String asistencia(Strig asistencia){
        n=asistencia.toLowercase();
        if (n="si"){
            System.out.println("El alumno: " + super.nombres());
        }
    }

    @Override
    public String toString() {
        return "Estudiante [notas=" + notas + ", carnet=" + carnet + super.toString() + "]";
    }  
    public static void main(String[] args) {
        Estudiante est1= new Estudiante(12324, "jean", "morales", 18, "udhiuwrbjkwnriuh4", 123456789, 20, 2313215);
        System.out.println(est1.toString());
    }
}
