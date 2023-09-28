package assignment3;

public class SQL implements DataBaseConnections {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection is done");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected successfully");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Update is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SQL a = new SQL();
        a.connect();
        a.disconnect();
        a.executeUpdate();
        
        }

}
