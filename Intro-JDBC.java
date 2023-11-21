import java.sql.*;
public class Intro {
//scarica https://dev.mysql.com/downloads/connector/j/
//scegli platform independent
//carica al liberia .jar nel tuo progetto --> built path
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//String db = "jdbc:ucanaccess:///Users/erica/Desktop/Database1.accdb";
		try {
		//String db = "jdbc:ucanaccess:///Users/erica/Desktop/Database1.accdb";
		
		//ottieni la connessione al db
		Connection con=DriverManager.getConnection("jdbc:ucanaccess://src/Database1.accdb");
		System.out.print("connesso");   
			//crea la statment
		Statement st = con.createStatement();
		//esegui la sql query
		ResultSet re = st.executeQuery("select * from tabella1");
		//processa il risultato
		while (re.next()) {
		System.out.println(re.getString("cognome")+ ", " + re.getString("nome"));	
			
			
		}	
		
			
			
		}
		catch(SQLException exc)
		{
			exc.printStackTrace();
		}
	}

}
