import java.util.List;
 
 
public class VerPersona{
	public void verCliente(Persona persona) {
		System.out.println("Datos de la persona: "+persona);
	}
	
	public void verPersonas(List<Persona> persona) {
		for (Persona persona1 : persona) {
			System.out.println("Datos de la persona: "+persona1);
		}		
	}
}
