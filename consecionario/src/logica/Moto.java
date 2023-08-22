package logica;

public class Moto extends Vehiculo {
	
	private int cilindraje;
	private double tam_tanque;
	
	public Moto() {
		
	}

	//Constructor
	public Moto(String placa, String marca, String referencia, String modelo, int num_Ruedas, int cilindraje, double tam_tanque,int precio) {
		super(placa, marca, referencia, modelo, num_Ruedas,precio);
		this.cilindraje = cilindraje;
		this.tam_tanque = tam_tanque;
	}


	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public double getTam_tanque() {
		return tam_tanque;
	}

	public void setTam_tanque(double tam_tanque) {
		this.tam_tanque = tam_tanque;
	}

	@Override
	public void queSoy() {
		// TODO Auto-generated method stub
		System.out.println("soy una moto");
	}

	
	//Comvierte un objeto a string para mostrarlo en pantalla 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "marca: "+ getMarca() +"\nplaca: "+getPlaca()+"\nreferencia: "+getReferencia()+"\nmodelo: "+getModelo()+"\nnumero de ruedas: "+getNum_Ruedas()+
				"\ncilindraje: "+cilindraje+"\ntamaño del tanque: "+tam_tanque+"\nPrecio: "+getPrecio();
	}

}
