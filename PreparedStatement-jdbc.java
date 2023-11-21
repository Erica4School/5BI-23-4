import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class queryInputStream {
	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		String dest, nome = "";

       
		String url =  "jdbc:ucanaccess://src/Database1.accdb";
		String cerca = "SELECT emp_name FROM impiegat WHERE emp_id = ?";
	

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(input);
		
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet re = null;
		
		
		try {
			
			con = DriverManager.getConnection(url);
			pre = con.prepareStatement(cerca);
			
			
			try {
				nome= buff.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pre.setString(1,nome);
			re = pre.executeQuery();
			
			while(re.next()) {
				dest=re.getString(1);
				System.out.println("impiegato: " +dest);
				System.out.println("---------");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (pre != null) {
				try {
					pre.close();
				} catch (SQLException ex) {
				}
			}
			if (re != null) {
				try {
					re.close();
				} catch (SQLException ex) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ex) {
				}
			}
		}
	}
}


