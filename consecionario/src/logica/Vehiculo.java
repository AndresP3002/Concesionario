package logica;

public abstract class Vehiculo {
	private String placa;
	private String marca;
	private String referencia;
	private String modelo;
	private int num_Ruedas;
	private int precio;
	
	public Vehiculo() {}
	
	
	public Vehiculo(String placa, String marca, String referencia, String modelo, int num_Ruedas,int precio) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.referencia = referencia;
		this.modelo = modelo;
		this.num_Ruedas = num_Ruedas;
		this.precio=precio;
	}
	


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getNum_Ruedas() {
		return num_Ruedas;
	}


	public void setNum_ruedas(int num_Ruedas) {
		this.num_Ruedas = num_Ruedas;
	}
	
	
	public abstract void queSoy();
	
	public abstract String toString();


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

}
