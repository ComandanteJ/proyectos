package ejer1;

public class Temperatura{


	public String fecha;
	public int tempMin,tempMax;

	public Temperatura() {

		this.fecha = "1/1/2017";
		this.tempMin = 10;
		this.tempMax = 10;

	}

	public Temperatura(int tempMin,int tempMax) {

		Fecha f = new Fecha(PedirDatos.leerEntero("Dia: "), PedirDatos.leerEntero("Mes: "), PedirDatos.leerEntero("Año: "));
		this.fecha = f.toString();
		this.tempMin = tempMin;
		this.tempMax = tempMax;

	}

	public int getTempMin() {
		return tempMin;
	}

	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}

	public int getTempMax() {
		return tempMax;
	}

	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}

	public int getTempMed() {

		int tempMed = (tempMax + tempMin) / 2;
		return tempMed;

	}

	public String toString() {

		String todo = "Informe de temperaturas en fecha "+this.fecha+": Minima- "+this.tempMin+". Max: "+this.tempMax+". Media: "+getTempMed()+".";
		return todo;

	}

}
