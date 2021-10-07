import java.util.*;
import java.sql.*;
 
public class MetodosImplementados implements Metodos {	
	
	@Override
	public boolean registrar(int id, String nombre, LocalDateTime fechaNac) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO cliente values (NULL,'"+id+"','"+nombre+"','"+fechaNac+"')";
		
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
 
	@Override
	public List<Persona> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM CLIENTE ORDER BY ID";
		
		List<Persona> listaPersona= new ArrayList<Persona>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Persona p=new Persona();
				p.setId(rs.getInt(1));
				p.setNombre(rs.getString(3));
				// no se implementarlo p.setFechaNac(rs.getLocalDateTime(4));
				listaPersona.add(p);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error.");
			e.printStackTrace();
		}
		
		return listaPersona;
	}
 
	@Override
	public boolean actualizar(Persona persona) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE PERSONA SET id='"+persona.getId()+"', nombres='"+persona.getNombre() +" WHERE ID="+persona.getFechaNac();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error.");
			e.printStackTrace();
		}		
		return actualizar;
	}
 
	@Override
	public boolean eliminar(Persona persona) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM PERSONA WHERE ID="+persona.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error.");
			e.printStackTrace();
		}		
		return eliminar;
	}
 
}
