package homeassignment;

public class APIClient {
	public void sendrequest(String endpoint) {
		System.out.println("Endpoint:"+endpoint);
	}
	public void sendrequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("Endpoint:"+endpoint+ "RequestBody:"+requestBody+ "RequestStatus:"+requestStatus);
	}
	public static void main(String[] args) {
		APIClient mm = new APIClient();
		mm.sendrequest("Hi this is Meena");
        mm.sendrequest("Shavin", "Dashvin", true);;
	}

}
