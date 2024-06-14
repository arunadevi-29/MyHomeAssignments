package homeassignmentday7;

public class JavaConnection implements DataBaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection C = new JavaConnection();
		
		C.connect();
		C.disconnect();
		C.executequery();
		C.executeUpdate();
	}

	public void connect() 
	{
		System.out.println("connect with Abstract Database");
	}
	public void disconnect()
	{
		System.out.println("Disconnect with Abstract Database");
	}
	
	
	public void executequery()
	{
		System.out.println("The Query Executed");
	}
	
	public void executeUpdate()
	{
		System.out.println("Execute Update with Abstract Database");
	}
	
}
