import java.io.*;

//On GitHub
public class learn14 {
	// IO STREAM file bytes i/o
	public static void file_r() {
		// ���������� ����� ��������� ������
		FileInputStream myFile = null;
		BufferedInputStream buff = null;
		// �������� ������������� � ������������ �����
		try {
			// �������� ������ ����� � ���� abc.dat
			myFile = new FileInputStream("xyz.dat");
			// �������� ������ ��� ����������� ������ �������� ������
			buff = new BufferedInputStream(myFile);
			// ����� �����
			boolean eof = false;
			// ���� �� ��������� ����� �����
			while (!eof) {
				// ������
				int byteValue = buff.read();
				System.out.println(byteValue + " ");
				// ���� ���������� �����������, �� ����� �����
				if (byteValue == -1) {
					eof = true;
				}
			}
		}
		// �������� ���������� � ������ �������
		catch (IOException e) {
			System.out.println("Could not read file: " + e.toString());
		} finally {
			if (myFile != null) {
				try {
					// �������� ����� � ����
					buff.close();
					myFile.close();
				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
			}
		}
	}

	public static void file_w() {
		int a[] = { 2, 5, 89, 88, 48, 7 };
		FileOutputStream myFile = null;
		try {
			myFile = new FileOutputStream("xyz.dat");
			for (int i = 0; i < a.length; i++) {
				myFile.write(a[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Could not write file: " + e.toString());
		} finally {
			if (myFile != null) {
				try {
					myFile.close();
				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
			}

		}
	}

	// IO STREAM Text i/o
	public static void text_r() {
		StringBuffer buffer = new StringBuffer();
		try {
			FileInputStream myFile = new FileInputStream("text.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(myFile, "Windows-1251"));
			int ch;
			while ((ch = reader.read()) > -1) {
				buffer.append((char) (ch));
			}
			String result = buffer.toString();
			System.out.println(result);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void text_w() {
		try {
			String myAdress = "����� ����� ������������ �������������";
			FileOutputStream myFile = new FileOutputStream("text.txt");
			Writer out = new BufferedWriter(new OutputStreamWriter(myFile, "Windows-1251"));
			out.write(myAdress);
			out.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// file_r();
		// file_w();
		// text_r();
		text_w();
	}
}
