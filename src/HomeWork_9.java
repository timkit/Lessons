import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class HomeWork_9 {

	public static void ZipRead() {
		

	try(ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream("arx.zip")))){
		
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
		ZipRead();
		

	}

}
