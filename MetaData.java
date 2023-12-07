import java.sql.*;

public class mainnn {

	public static void main(String[] args) {
	String url="jdbc:ucanaccess://src/db.accdb";
	String query = "SELECT * FROM login";
	Connection con=null;
	Statement stmt= null;
	ResultSet rs=null;
	
	try {
con = DriverManager.getConnection(url, "", "");
stmt= con.createStatement();
rs= stmt.executeQuery(query);
//metadati: righe e colonne
ResultSetMetaData rsmd = rs.getMetaData();
int numCol= rsmd.getColumnCount();
for (int i=1; i<=numCol; i++) {
//nome delle colonne
	String n = rsmd.getColumnName(i);
//tipologia delle colonne
	String t = rsmd.getColumnTypeName(i);
System.out.print("numero colonna "+ i + " nome "+ n );
System.out.println(" tipo "+ t );
	
}
	} catch (SQLException e) {
		System.err.println(e.getMessage());
		e.printStackTrace();
	}
	finally {
		if (stmt!= null) { 
			try {stmt.close();}
			catch (SQLException e) {}
		}
	}
	}

}
