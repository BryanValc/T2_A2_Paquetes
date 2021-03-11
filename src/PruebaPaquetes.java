import edu.tecjerez.topicos.figuras.dosDimensiones.*;



public class PruebaPaquetes {
	
	public static void main(String[] args) {
		
		Rombo rmb = new Rombo(8, 6);
		System.out.println(rmb.obtenerArea());
		System.out.println(rmb.obtenerPerimetro());
		
		Circulo crc = new Circulo(1);
		System.out.println(crc.obtenerArea());
		System.out.println(crc.obtenerPerimetro());
		
		Elipse elp = new Elipse(3,2);
		System.out.println(elp.obtenerArea());
		System.out.println(elp.obtenerPerimetro());
		
	}

}
