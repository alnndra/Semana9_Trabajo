package Uchill;

public class Profesor extends Persona{
	int numHoras;
	int aniosExperiencia;
	public Profesor() {
	
	}
	public Profesor (int numHoras, int aniosExperiencia) {
		this.numHoras = numHoras;
		this.aniosExperiencia = aniosExperiencia;
	}
	public Profesor (int dni, String nombres, String apellidos, int edad, String correo, int telefono, int numHoras, int aniosExperiencia) {
		super(dni, nombres, apellidos, edad, correo, telefono);
		this.numHoras = numHoras;
		this.aniosExperiencia = aniosExperiencia;
		}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public double calcSalarioDiario(int numHoras) {
		double salario = numHoras * 80; //el sueldo por hora es de 80 soles
		return salario;
		}
	
	public String toString () {
		return "Profesor[Horas trabajadas="+numHoras+",Años de experiencia ="+aniosExperiencia+super.toString()+"]";
		}
	}
