import java.io.*;

public class learn9_Java7 {

	public static void file_r() {
		// ���������� ����� ��������� ������
		BufferedInputStream buff = null;
		// �������� ������������� � ������������ �����
		try (FileInputStream myFile = new FileInputStream("xyz.dat")) {
			//
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

		}

	}

	public static void main(String[] args) {

file_r();

	}

}
