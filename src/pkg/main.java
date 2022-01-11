package pkg;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conexion c = conexion.getInstancia();
		conexion c1 = conexion.getInstancia();
		//conexion c2 = new conexion();
		c1.conectar();
		c1.desconectar();
		System.out.println(c + "\n"+ ""+c1 + "\n");
		
	}

}
