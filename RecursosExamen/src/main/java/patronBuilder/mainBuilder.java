package patronBuilder;

public class mainBuilder {
	
	public static void main(String[] args) {
		
		
		
		Dominos a = PizzeriaBuilder.crearDominos(0, null, null);
		Telepiza b = PizzeriaBuilder.crearTelepiza(0, null, null);
		
		System.out.println(a.llamadaEmergencias(SizePizza.Grande, null));
		System.out.println(a.llamadaEmergencias(SizePizza.Mediana, null));
		System.out.println(a.llamadaEmergencias(SizePizza.Pequeña, null));

		
		
		System.out.println(b.llamadaEmergencias(SizePizza.Grande, null));
		System.out.println(b.llamadaEmergencias(SizePizza.Mediana, null));
		System.out.println(b.llamadaEmergencias(SizePizza.Pequeña, null));
		
	}
	

}
