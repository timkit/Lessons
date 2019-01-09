import java.io.*;

public class Deserialize {
	public static void ds() throws ClassNotFoundException, IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Employee bemp = new Employee();

		try {
			fis = new FileInputStream("Out.ser");
			ois = new ObjectInputStream(fis);
			bemp = (Employee) ois.readObject();
			System.out.println(bemp.salary);
		} catch (Exception eq) {
			// TODO: handle exception
			eq.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ds();
		} catch (Exception e) {
			System.out.println("You have some problem");
		}
	}
}
