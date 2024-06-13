package homeassignmentday5;

public class ApiClient {

	
		// TODO Auto-generated method stub
		public void sendRequest(String name)
		{
			System.out.println(name);
			
		}
		public void sendRequest(String name, boolean status)
		{
			System.out.println("client name :" + name + " status of the API call :" +status );
			
		}
		
	public static void main(String[] args) {
		
		ApiClient client = new ApiClient();
		client.sendRequest("aruna");

		client.sendRequest("aruna", true);
	}
	
	}


