import java.io.*;

public class learn9_Java7 {

	public static void file_r() {
		// переменная ввода файлового потока
		BufferedInputStream buff = null;
		// проверка существования и корректности файла
		try (FileInputStream myFile = new FileInputStream("xyz.dat")) {
			//
			// создание буфера для ускоренного чтения порциями байтов
			buff = new BufferedInputStream(myFile);
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

		}

	}
	public static void file_w() {
		int a[] = {212, 5, 89, 88, 48, 72 };
		try (FileOutputStream myFile = new FileOutputStream("xyz.dat")){
			for (int i = 0; i < a.length; i++) {
				myFile.write(a[i]);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Could not write file: " + e.toString());
		}
	}

	public static void main(String[] args) {

file_r();

	}

}
