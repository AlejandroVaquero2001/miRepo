 import java.util.ArrayList;
import java.util.List;

 
public class ControlarPersona {
	
	private VerPersona vista= new VerPersona();
	public ControlarPersona() {
	}
	
	public void registrar(Persona persona ) {
		MetodosImplementados mi= new  MetodosImplementados();
		mi.registrar(persona);
	}
	
	public void actualizar(Persona persona) {
		MetodosImplementados mi= new  MetodosImplementados();
		mi.actualizar(persona);
	}
	
	public void eliminar(Persona persona) {
		MetodosImplementados mi= new  MetodosImplementados();
		mi.eliminar(persona);
	}
	
	public void verClientes(){
		List<Persona> persona = new ArrayList<Persona>();
		MetodosImplementados mi= new  MetodosImplementados();
		persona=mi.obtener();
		vista.verPersonas(persona);
	}
}