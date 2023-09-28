package assignment3;

public class JavaConnection extends MySQLConnections {

	public static void main(String[] args) {
		JavaConnection b = new JavaConnection();
		b.connect();
		b.disconnnect();
		b.executeUpdate();
		b.executeQuery();
		// TODO Auto-generated method stub

	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connection is done");
	}

	public void disconnnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected successfully");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Update Execution is done");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Query is executed done");
	}

}
