import edu.tecjerez.topicos.figuras.dosDimensiones.*;
import edu.tecjerez.topicos.figuras.tresDimensiones.*;


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
		
		Piramide prm = new Piramide(3,5);
		System.out.println(prm.obtenerVolumen());
		System.out.println(prm.obtenerArea());
		
		Cono cn = new Cono(3,5);
		System.out.println(cn.obtenerVolumen());
		System.out.println(cn.obtenerArea());
		
	}

}
