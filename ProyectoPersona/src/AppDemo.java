public class AppDemo{
 
	public static void main(String[] args) {
 
		Persona persona = new Persona(1717213183, "Alejandro", "6-10-1984 00:00:00");			
		Scanner sc = new Scanner(System.in);
		
		ControlarPersona controlador = new ControlarPersona();
		MetodosImplementados mi = new MetodosImplementados();
 
		controlador.registrar(persona);
		
		int eleccion;
		eleccion = sc.nextInt();
		System.out.println("1 para insertar persona\n2para borrar persona\n3 para ver un listado de personas");
		switch(eleccion) {
		
		case 1:  
			int id,String n,String f;
			System.out.println("Introduzca un id para la persona");
			System.out.println("Introduzca un nombre para la persona");
			System.out.println("Introduzca la fecha de nacimiento de la persona");
			mi.registrar(id,n,f);
		break;
		case 2:  mi.eliminar();
		break;
		case3:	mi.obtener();
		break;		
		}
		
	}
}