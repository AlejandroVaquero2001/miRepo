import java.util.List;
 
 
public interface Metodos {	
	public boolean registrar(Persona persona);
	public List<Persona> obtener();
	public boolean actualizar(Persona persona);
	public boolean eliminar(Persona persona);
}