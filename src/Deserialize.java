import java.io.*;

public class Deserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Employee bemp = new Employee();

		try {
			fis = new FileInputStream("Out.ser");
			ois = new ObjectInputStream(fis);
			bemp = (Employee)ois.readObject();
			System.out.println(bemp.salary);
		} catch (ClassNotFoundException cnf) {
			// TODO: handle exception
			cnf.printStackTrace();
		}
		catch (IOException e) {
			try {
			ois.close();
			fis.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
				
			}
			// TODO: handle exception
		}

	}

}
