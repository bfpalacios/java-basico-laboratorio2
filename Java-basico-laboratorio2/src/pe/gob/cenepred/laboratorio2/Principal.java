package pe.gob.cenepred.laboratorio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//instanciar las clases 
		
		BicicletaCarrera bikerRacer = new BicicletaCarrera();
		
		//accediendo al metooo de la clase padre Bicicleta
		bikerRacer.frenar();
		
		
		//metodo que pasa valor
		bikerRacer.cambiarVelocidad(10);
		
	}

}
