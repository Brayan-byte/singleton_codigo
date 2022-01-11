package pkg;

public class conexion {
	
	//Declaracion
	private static conexion instancia;
	//private static conexion instncia = new Conexion();
	
	//Para evitar instancia mediante el operador "new"
	private conexion() {
		
	}
	
	//Para obtener la instancia unicamente por este metodo
	//Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
	
	public static conexion getInstancia() {
		if(instancia == null) {
			instancia = new conexion();
		}
			return instancia;
	}
	
	//Metodo de prueba
	public void conectar() {
		System.out.println("Me conecte a la BD");
	}
	
	public void desconectar() {
		System.out.println("Me desconecte de la BD");
	}
}
