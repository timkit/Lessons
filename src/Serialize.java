import java.io.*;

public class Serialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.name = "Jhon";
		emp.age = 25;
		emp.salary = 12500;

		FileOutputStream fos = null;
		// Output stream for serialization
		ObjectOutputStream ous = null;

		try {
			fos = new FileOutputStream("Out.ser");
			ous = new ObjectOutputStream(fos);
			ous.writeObject(emp);
		} catch (IOException e) {
			try {
				ous.flush();
				ous.close();
				fos.close();
			} catch (IOException ieo) {
				// TODO: handle exception
				ieo.printStackTrace();
			}
			// TODO: handle exception
		}

	}

}
