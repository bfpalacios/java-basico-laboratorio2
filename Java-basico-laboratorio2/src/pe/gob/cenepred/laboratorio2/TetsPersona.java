package pe.gob.cenepred.laboratorio2;

public class TetsPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad = 60;
		Persona persona = new Persona("bruno","apellido",edad);
		

		System.out.println("Nombre "+ persona.getNombre() );
		System.out.println("Apellido "+ persona.getApellidos());
		System.out.println("Edad "+ persona.getEdad() );
	}

}
