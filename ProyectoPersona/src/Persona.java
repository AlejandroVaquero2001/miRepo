import java.time.LocalDateTime;

public class Persona{
	
	private int id;
	private String nombre;
	private LocalDateTime fechaNac ;
	
	public Persona() {
	}
	
	public Persona(int id, String n, String f) {
		this.id = id;
		this.nombre = n;
		LocalDateTime aLD = LocalDateTime.parse(f);
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getNombre() {
		return nombre;
	}
 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public LocalDateTime getFechaNac() {
		return fechaNac;
	}
 
	public void setFechaNac(LocalDateTime fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	@Override
	public String toString() {
		return this.id+", "+", "+this.nombre+", "+this.fechaNac;
	}
}
