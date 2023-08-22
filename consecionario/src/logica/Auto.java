package logica;

public class Auto extends Vehiculo {
	
	//Creacion de variables adicionales
	private int num_puertas;
	private boolean is_Gasolina;
	
	public Auto() {
		
	}
	
	
	//Contructor
	public Auto(String placa, String marca, String referencia, String modelo, int num_Ruedas,int num_Puertas, boolean is_Gasolina,int precio) {
		super(placa, marca, referencia, modelo, num_Ruedas,precio);
		this.num_puertas = num_Puertas;
		this.is_Gasolina = is_Gasolina;
	}

	

	public int getNum_Puertas() {
		return num_puertas;
	}



	public void setNum_Puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}



	public boolean isIs_Gasolina() {
		return is_Gasolina;
	}



	public void setIs_Gasolina(boolean is_Gasolina) {
		this.is_Gasolina = is_Gasolina;
	}



	@Override
	public void queSoy() {
		// TODO Auto-generated method stub
		System.out.println("soy un carro");
	}



	//Comvierte un objeto a string para mostrarlo en pantalla 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "marca: "+ getMarca() +"\nplaca: "+getPlaca()+"\nreferencia: "+getReferencia()+"\nmodelo: "+getModelo()+"\nnumero de ruedas: "+getNum_Ruedas()+
				"\numero de puertas: "+getNum_Puertas()+"\nes a gasolina?: "+is_Gasolina+"\nPrecio: "+getPrecio();
	}
	
	

}
