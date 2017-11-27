package ejer1;

public class Fecha {
	private int dia;
	private int mes;
	public int anio=2017;
	
	public Fecha(int dia, int mes, int anio) {
		if(!comprobarFecha(dia, mes)) {
			return;
		}
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public void setDia(int dia) {
		if(!comprobarFecha(dia, mes)) {
			return;
		}
		this.dia=dia;
	}
	
	public void setMes(int mes) {
		if(!comprobarFecha(dia, mes)) {
			return;
		}
		this.mes=mes;
	}
	
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAnio() {
		return this.anio;
	}

	@Override
	public String toString() {
		if(!comprobarFecha(dia, mes)) {
			return "La fecha no es valida";
		}
		return this.dia + "/" + this.mes + "/" + this.anio;
	}
	
	public void modificarFecha(int dia,int mes,int anio) {
		if(!comprobarFecha(dia, mes)) {
			return;
		}
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	private boolean comprobarFecha(int dia,int mes) {
		if(dia<1||dia>31||mes<1||mes>12) {
			System.out.println("Error");
			return false;
		}
		
		return true;
	}

	
	
	
}
