import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class HomeWork_14 {

	public static void ZipRead() {
	
		String fn="D:\\JavaProjects\\Lessons\\arx.zip";

	try(ZipInputStream zis =new ZipInputStream((new BufferedInputStream(new FileInputStream(fn))), Charset.forName("Windows-1251"))){
		
		ZipEntry ze;
		while((ze=zis.getNextEntry())!=null) {
			System.out.format("File %s, Size: %d %n",ze.getName(), ze.getSize());
			
		}
		zis.close();	
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Zip archive must contain only latin characters in compressed file name 
		// OR create ZipInputStream with charset attribute
		ZipRead();
		

	}

}
