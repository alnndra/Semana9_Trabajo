package Uchill;

public class Estudiante extends Persona {
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
    public void asistencia(String asistencia){
        if (asistencia=="si"||asistencia=="SI"){
            System.out.println("El alumno: " + getNombres() + " asistio a clase");
        }
        else{
            System.out.println("El alumno: " + getNombres() +" no asistio a la clase");
            
        }
    }
    @Override
    public String toString() {
        return "Estudiante [notas=" + notas + ", carnet=" + carnet + super.toString() + "]";
    }
}