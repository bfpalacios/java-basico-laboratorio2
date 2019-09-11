package pe.gob.cenepred.laboratorio2;

public class Test {

	public static void main(String args[]) {
		
		Debug d = new Debug(true, 20);
		
		
		d.print("Curso de Java");
		
		System.out.println("\n VALOR BOOBLEANO " + d.obtenerDebuggingOn());
		
	}

}
