package patronBuilder;

import java.util.List;

public class Dominos  extends Pizzerias {

	public Dominos(int id, List<Integer> equipo, String provincia) {
		super(id, equipo, provincia);
	}

	
	
	public String llamadaEmergencias(SizePizza te, String provincia) {
		
	String texto=null;
		
		if(te.equals(SizePizza.Grande)) {
			
			texto = "Pizza grande del dominos";
		}
		
	if(te.equals(SizePizza.Mediana)) {
			
			texto = "Pizza Mediana del dominos";
		}
	
	
	if(te.equals(SizePizza.Pequeña)) {
		
		texto = "Pizza Pequeña del dominos";
	}
		
		return texto;
		
		}

}
