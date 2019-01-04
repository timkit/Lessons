import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//On GitHub
public class learn9 {
	// IO STREAM file bytes i/o 
	public static void file_r() {
		// переменная ввода файлового потока
		FileInputStream myFile = null;
		BufferedInputStream buff = null;
		// проверка существования и корректности файла
		try {
			// создание потока ввода в файл abc.dat
			myFile = new FileInputStream("xyz.dat");
			// создание буфера для ускоренного чтения порциями байтов
			buff= new BufferedInputStream(myFile);
			// конец файла
			boolean eof = false;
			// пока не достигнут конец файла
			while (!eof) {
				// читаем
				int byteValue = buff.read();
				System.out.println(byteValue + " ");
				// если содержимое отсутствует, то конец файла
				if (byteValue == -1) {
					eof = true;
				}
			}
		}
		// Вызываем исключение в случае неудачи
		catch (IOException e) {
			System.out.println("Could not read file: " + e.toString());
		} finally {
			if (myFile != null) {
				try {
					// закрывем буфер и файл
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

	//IO STREAM Text i/o
	public static void text_r () {
		StringBuffer buffer= new StringBuffer();
		try {
			FileInputStream myFile=new FileInputStream("text.txt");
			InputStreamReader inputstreamreader=new InputStreamReader(myFile, "Windows-1251");
			BufferedReader reader = new BufferedReader(inputstreamreader);
			int ch;
			while((ch=reader.read())>-1) {
				buffer.append((char)(ch));
			}
			String result = buffer.toString();
			System.out.println(result);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
	public static void text_w() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	file_r();
		// file_w();
		text_r();
	}

}
