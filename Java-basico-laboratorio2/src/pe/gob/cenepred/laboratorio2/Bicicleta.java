package pe.gob.cenepred.laboratorio2;

public class Bicicleta {

	//declaracion de variables de instancia o clase
	int velocidadActual; 
	int velocidadMaxima; 
	int engranajeActual;  
	String nroAro;
	String marca; 
	String modelo;
	
	
	//declaracion de metododos de instancia o clase
	void cambiarLlantas(){
		System.out.println("Cambiando llantas"); 
	}
	
	void frenar() {
		System.out.println("Frenando"); 
	}
	
	void cambiarVelocidad(int engranajeActual){ 
		
		System.out.println("Mostrando velocidad inicial " + this.engranajeActual); 
		
		this.engranajeActual = engranajeActual;
		
		
		System.out.println("Cambiando velocidad a " + engranajeActual); 
	
	
	}
	
	 

}
