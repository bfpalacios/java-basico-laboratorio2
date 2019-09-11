package pe.gob.cenepred.laboratorio2;

public class Debug {

	private boolean debuggingOn;
	//atributo de tipo constante
	//public final int LEVEL = 1;
	
	private int level; 
	
	//public Debug() {}
	
	//metodo de tipo constructor
	public Debug(boolean estado, int level ) {
		this.debuggingOn = estado;
		this.level = level;
		
	}
	 

	public void print(String msg) {
		if (this.debuggingOn) {
			System.out.print(msg);
		}
	}
	
	public boolean obtenerDebuggingOn() {
		return this.debuggingOn;
	}

}
