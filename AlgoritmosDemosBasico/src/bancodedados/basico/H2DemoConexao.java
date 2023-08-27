package bancodedados.basico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H2DemoConexao {

	public static void main(String[] args) {
		
		/**
		 * H2 Database - basico - em memoria
		 * 
		 */
		
		String url = "jdbc:h2:mem:";
		
		try {
			Connection con = DriverManager.getConnection(url);
			
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery("SELECT 1+1");
			
			if(rs.next()) {
				System.out.println(rs.getInt(1));
				
			}	
			
			con.close();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		

	}

}
