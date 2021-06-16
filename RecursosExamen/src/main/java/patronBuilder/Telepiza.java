package patronBuilder;

import java.util.List;

public class Telepiza extends Pizzerias{

	public Telepiza(int id, List<Integer> equipo, String provincia) {
		super(id, equipo, provincia);
		// TODO Auto-generated constructor stub
	}

	
	
	public String llamadaEmergencias(SizePizza te, String provincia) {
		String texto=null;
		
		if(te.equals(SizePizza.Grande)) {
			
			texto = "Pizza grande del telepi";
		}
		
	if(te.equals(SizePizza.Mediana)) {
			
			texto = "Pizza Mediana del telepi";
		}
	
	
	if(te.equals(SizePizza.Pequeña)) {
		
		texto = "Pizza Pequeña del telepi";
	}
		
		return texto;
		}

}
