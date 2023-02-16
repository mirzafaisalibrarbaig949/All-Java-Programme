package JDBCfirst;

public class RegisteringDriver {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Register");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
