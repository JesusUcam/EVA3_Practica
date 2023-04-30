package practica.libreria;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
	
	//Se pueden añadir atributos
	private String nombre;
	private String telefono;
	
	private static ArrayList<Producto> cesta;
	
	private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	//Getters n Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public static ArrayList<Producto> getCesta() {
		return cesta;
	}
	public static void setCesta(ArrayList<Producto> cesta) {
		Cliente.cesta = cesta;
	}
	public static ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}
	public static void setListaCliente(ArrayList<Cliente> listaCliente) {
		Cliente.listaCliente = listaCliente;
	}
	
	//Constructores
	public Cliente() {}
	public Cliente(String nombre, String telefono) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		
		cesta = new ArrayList<Producto>();
		
	}
	@Override
	public String toString() {
		return "Cliente: " + super.toString() + " [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	//Metodos
	public static Cliente iniciarSesion() {
		
		Cliente c = null;
		
		System.out.print("Introduzca su nombre: ");
		String nombre = Principal.stringScaner();
		
		System.out.print("Introduzca su numero de telefono: ");
		String telefono = Principal.stringScaner();
		
		for (Cliente clienteNom : listaCliente) {
			
			if(clienteNom.getNombre().equalsIgnoreCase(nombre)) {
				
				for (Cliente clienteTelef : listaCliente) {
					
					if (clienteTelef.getTelefono().equals(telefono)) {
						
						c = clienteTelef;
						
					}
					
				}
				
			}
			
		}
		
		if (c==null) {
			
			c = new Cliente(nombre, telefono);
			getListaCliente().add(c);
			
			System.out.println("¡Sus datos han sido registrados correctamente! Ya puede comprar en nuestra libreria");
			
		}
		
		return c;
		
	}
	
	public static void mostrarCesta(Cliente c) {
		
		for (Producto cesta : cesta) {
			
			System.out.println(c.cesta);
			
		}
		
	}
	
}
