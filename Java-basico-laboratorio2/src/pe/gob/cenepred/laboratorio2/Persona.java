package pe.gob.cenepred.laboratorio2;

public class Persona {
	
	//declaracion de las variables de instancia
	private String nombre;
	private String apellidos;
	private byte edad;
	
	
//declaracioon de constructor personalizado
	public Persona(String n, String a, byte e) {
		this.nombre = n;
		this.apellidos = a;
		this.edad = e;
	}
 
	
	//declaracion de metodos de instancia
	
	public String getNombre() {
		return nombre;
	} 

	public String getApellidos() {
		return apellidos;
	}
   
	public byte getEdad() {
		return edad;
	}
	 
	
}
