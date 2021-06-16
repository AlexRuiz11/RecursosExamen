package patronBuilder;

import java.util.List;


public class PizzeriaBuilder {

	public static Dominos crearDominos(int id, List<Integer> equipo, String provincia) {
		Dominos bombero = null;
		
		bombero = new Dominos(id, equipo, provincia);
		
		return bombero;
	}
	
	
	
	public static Telepiza crearTelepiza(int id, List<Integer> equipo, String provincia) {
		Telepiza bombero = null;
		
		bombero = new Telepiza(id, equipo, provincia);
		
		return bombero;
	}
	
}
