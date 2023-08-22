package logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Concesionario {
	private Auto auto=new Auto();
	private Moto moto=new Moto();
	public static ArrayList<Vehiculo> vehiculos_Disponibles=new ArrayList<Vehiculo>();
	public static ArrayList<Vehiculo> vehiculos_Vendidos=new ArrayList<Vehiculo>();
	
	
	//Se solicitan todos los datos sobre el vehiculo ya sea auto o moto, 
	//se crea el objeto con los datos y se agrega a un arraylist
	
	public void ingresar_Vehiculo(int tipo) {
			if(tipo==1){
				String placa=JOptionPane.showInputDialog("Digite la placa");
				String referencia=JOptionPane.showInputDialog("Digite la referencia");
				String marca=JOptionPane.showInputDialog("Digite la marca");
				String modelo=JOptionPane.showInputDialog("Digite el modelo");
				int numPuertas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de puertas"));
				int numRuedas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Ruedas"));
				boolean gasolina=Boolean.valueOf(JOptionPane.showInputDialog("Es a gasolina?"));
				int precio=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del vehiculo"));	

				auto.setPlaca(placa);
				auto.setReferencia(referencia);
				auto.setMarca(marca); 
				auto.setModelo(modelo); 
				auto.setNum_Puertas(numPuertas); 
				auto.setNum_ruedas(numRuedas);		
				auto.setIs_Gasolina(gasolina); 
				auto.setPrecio(precio);
				vehiculos_Disponibles.add(auto);
		}else {
			String placa=JOptionPane.showInputDialog("Digite la placa");
			String referencia=JOptionPane.showInputDialog("Digite la referencia");
			String marca=JOptionPane.showInputDialog("Digite la marca");
			String modelo=JOptionPane.showInputDialog("Digite el modelo");
			int numRuedas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Ruedas"));
			int cilindraje=Integer.parseInt(JOptionPane.showInputDialog("Digite el cilindraje de la moto"));
			double tamTanque=Double.parseDouble(JOptionPane.showInputDialog("Digite el cilindraje de la moto"));
			int precio=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del vehiculo"));	
			
			moto.setPlaca(placa);
			moto.setReferencia(referencia);
			moto.setMarca(marca);
			moto.setModelo(modelo);
			moto.setNum_ruedas(numRuedas);
			moto.setCilindraje(cilindraje);
			moto.setTam_tanque(tamTanque);
			moto.setPrecio(precio);
			vehiculos_Disponibles.add(moto);
		}
		
	}
	
	public void buscar_Vehiculo() {
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Buscar en vehiculos disponibles"                                                       + "\n2. Buscar en vehiculos vendidos "));
		String dato=JOptionPane.showInputDialog("Digita la placa del vehiculo que deseas buscar");
		
		if(opcion==1) {
			//Recorre el array de los vahiculos disponibles, y va comparando las placas del array con la que ingreso el usuario
			for(int i=0;i<vehiculos_Disponibles.size();i++) {
				if(vehiculos_Disponibles.get(i).getPlaca().equals(dato)) {
					JOptionPane.showMessageDialog(null,vehiculos_Disponibles.get(i).toString());
				}else {
					JOptionPane.showMessageDialog(null,"Vehiculo no esta registrado o ya se vendio");
				}
			}
		}else {
			//Recorre el array de los vahiculos Vendidos, y va comparando las placas del array con la que ingreso el usuario

			for(int i=0;i<vehiculos_Vendidos.size();i++) {
				if(vehiculos_Vendidos.get(i).getPlaca().equals(dato)) {
					JOptionPane.showMessageDialog(null,vehiculos_Vendidos.get(i).toString());
				}else {
					JOptionPane.showMessageDialog(null,"Vehiculo no encontrado");
				}
			}
		}
	}
	public void vender_Vehiculos() {
		// Busca la placa ingresada para pasar el vehiculo del array de disponibles al de Vendidos
		String dato=JOptionPane.showInputDialog("Digita la placa del vehiculo que deseas vender");
		for(int i=0;i<vehiculos_Disponibles.size();i++) {
			if(vehiculos_Disponibles.get(i).getPlaca().equals(dato)) {
				vehiculos_Vendidos.add(vehiculos_Disponibles.get(i));
				vehiculos_Disponibles.remove(i);
			}else {
				JOptionPane.showMessageDialog(null,"Vehiculo no encontrado");
			}
		}
	}
		
		
	public void cantidades() {
		int cantidad_Motos=0; 
		int cantidad_Autos=0;
		int cantidad_Vendidos=0; 
		int cantidad_Disponibles=0;
		
		for(int i=0;i<vehiculos_Disponibles.size();i++) {
			if(vehiculos_Disponibles.size()==0) {
				
			}else {
				cantidad_Disponibles++;
				if(vehiculos_Disponibles.get(i).getClass().equals(auto.getClass())) {
					cantidad_Autos++;
				}else if(vehiculos_Disponibles.get(i).getClass().equals(moto.getClass())) {
					cantidad_Motos++;
				}
			}
		}
		for(int j=0;j<vehiculos_Vendidos.size();j++) {
			if(vehiculos_Vendidos.size()==0) {
				
			}else {
				cantidad_Vendidos++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Cantidad de vehiculos disponibles: "+cantidad_Disponibles+"\n"+ "Cantidad de autos: "
		+cantidad_Autos+"\nCantidad de motos: "+cantidad_Motos+"\nCantidad de vehiculos vendidos: "+cantidad_Vendidos);
	}
	public void total_Ventas() {
		//muestra el total de las ventas que se han tenido o si no se han registrado ventas
		int total=0;
		for(int i=0;i<vehiculos_Vendidos.size();i++) {
			if(vehiculos_Vendidos.size()==0) {
				JOptionPane.showMessageDialog(null, "No hay vehiculos vendidos");
			}else {
				total+=vehiculos_Vendidos.get(i).getPrecio();
				JOptionPane.showMessageDialog(null, "El total de ventas a sido de: "+total);
			}
		}
	}
	
	public void mostrar_Disponibles() {
		for(int i=0;i<vehiculos_Disponibles.size();i++) {
			System.out.println(i+". "+vehiculos_Disponibles.toString());
		}
	}
	
	//Metodo para quitar vehiculos del arraylist, comparandolos con los objetos del arraylist
		public void eliminar_Vehiculo() {
			String dato=JOptionPane.showInputDialog("Digita la placa del vehiculo que deseas eliminar");
			for(int i=0;i<vehiculos_Disponibles.size();i++) {
				if(dato.equals(vehiculos_Disponibles.get(i).getPlaca())) {
					vehiculos_Disponibles.remove(i);
				}else {
					JOptionPane.showMessageDialog(null, "Vehiculo no encontrado");
				}
			}
		}
	
	//Menu donde Se muestran las opciones de la aplicacion
	public void menu() {
		int opcion=9;
			while (opcion!=0) {
				opcion=Integer.parseInt(JOptionPane.showInputDialog(
						"1.Agregar Vehiculo."+
						"\n2.Buscar Vehiculo."+
						"\n3.Ver vehiculos disponibles."+
						"\n4.Vender vehiculos"+
						"\n5.Ver cantidades."+
						"\n6.Actualizar Datos."+
						"\n7.Ver ventas totales"+
			            "\n8.Eliminar vehiculos"+
						"\n0.Salir"));
				switch (opcion) {
				case 1:
					int tipo=Integer.parseInt(JOptionPane.showInputDialog("1.Auto"+"\n2.Moto"));
					ingresar_Vehiculo(tipo);
					break;
				case 2:
					buscar_Vehiculo();
					break;
				case 3:
					mostrar_Disponibles();
					break;
				case 4:
					vender_Vehiculos();
					break;
				case 5:
					cantidades();
					break;
				case 6:
					
				case 7:
					total_Ventas();
					break;
				case 8:
					eliminar_Vehiculo();
					break;
				case 0: 
					break;
				}
			}
	}
}
