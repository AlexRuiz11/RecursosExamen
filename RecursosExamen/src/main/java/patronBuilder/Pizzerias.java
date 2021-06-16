package patronBuilder;

import java.util.List;



public abstract class Pizzerias {
	
	
	
	protected int id;
	protected List<Integer> equipo;
	protected String provincia;
	public Pizzerias(int id, List<Integer> equipo, String provincia) {
		
		this.id = id;
		this.equipo = equipo;
		this.provincia = provincia;
	}
	

	public String llamadaEmergencias(SizePizza te, String provincia) {
		return null;};

}
